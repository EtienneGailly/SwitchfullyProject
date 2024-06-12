package basic.codelab03;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static com.switchfully.ReflectionTestUtil.onClass;

class AccountTest {


    public static final String CLASS_NAME = "basic.codelab03.Account";
    public static final String ACCOUNT_OWNER_CLASS_NAME = "basic.codelab03.AccountOwner";

    @Test
    void checkAccountClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        Field.field("balance", double.class),
                        Field.field("accountOwner", onClass(ACCOUNT_OWNER_CLASS_NAME).retrieveClass()),
                        Field.field("accountNumber", long.class)
                );
    }

    @Test
    void checkAccountConstants() {
        onClass(CLASS_NAME)
                .expectConstants(
                        Field.field("MAX_WITHDRAW_AMOUNT", double.class),
                        Field.field("MAX_DEPOSIT_AMOUNT", double.class)
                );
    }

    @Test
    void checkAccountConstructor() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .expectField("balance").toHaveValue(10.50)
                .expectField("accountOwner").toHaveValue(accountOwner)

                .expectField("accountNumber").toFollowConstraint((Predicate<Long>) accountNumber -> accountNumber >= 1 && accountNumber <= 500000000);
    }

    @Test
    void checkWithdraw() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("withdraw", 10.0)
                .and()
                .expectField("balance").toHaveValue(0.50);
    }


    @Test
    void checkWithdrawBelowZero() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("withdraw", 20.0).expectToBePrinted("""
                        You can not withdraw below zero.
                        """)
                .and()
                .expectField("balance").toHaveValue(10.50);
    }

    @Test
    void checkWithdrawMoreThan5000() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10000.0, accountOwner)
                .callMethod("withdraw", 5001.0).expectToBePrinted("""
                        You can not withdraw more than 5000.
                        """)
                .and()
                .expectField("balance").toHaveValue(10000.0);
    }

    @Test
    void checkDeposit() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("deposit", 20.0)
                .and()
                .expectField("balance").toHaveValue(30.50);
    }

    @Test
    void checkDepositMoreThan80000() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("deposit", 80001.0)
                .expectToBePrinted("""
                        You can not deposit more than 80000.
                        """)
                .and()
                .expectField("balance").toHaveValue(10.50);
    }

    @Test
    void checkGetters() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("firstName", "lastName").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("getBalance").expectReturnToBe(10.50).and()
                .callMethod("getAccountNumber");

    }

    @Test
    void checkToString() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("Ada", "Lovelace").retrieveObject();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("toString").expectResultToFollowConstraint((Predicate<String>) string -> string.contains("and owner Mr. or Mrs. Ada, Lovelace has balance 10.5"));
    }

    @Test
    void accountCounter() {
        Object accountOwner = onClass(ACCOUNT_OWNER_CLASS_NAME).callConstructor("Ada", "Lovelace").retrieveObject();
        Object numberOfAccounts = onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("getNumberOfAccounts").retrieveResult();
        onClass(CLASS_NAME)
                .callConstructor(10.50, accountOwner)
                .callMethod("getNumberOfAccounts").expectReturnToBe((int) numberOfAccounts + 1);
    }
}
