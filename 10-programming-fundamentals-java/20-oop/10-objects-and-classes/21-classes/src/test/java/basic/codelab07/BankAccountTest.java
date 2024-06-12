package basic.codelab07;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class BankAccountTest {

    public static final String CLASS_NAME = "basic.codelab07.BankAccount";

    @Test
    void checkIfBankAccountClassExists() {
        onClass(CLASS_NAME);
    }

    @Test
    void checkIfBankAccountHasCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("accountNumber", String.class),
                        field("name", String.class),
                        field("balance", int.class)
                );
    }

    @Test
    void checkHas2ParameterConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName")
                .expectField("accountNumber").toHaveValue("anAccountNumber")
                .expectField("name").toHaveValue("aName");
    }

    @Test
    void checkHas3ParameterConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .expectField("accountNumber").toHaveValue("anAccountNumber")
                .expectField("name").toHaveValue("aName")
                .expectField("balance").toHaveValue(2000);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("getAccountNumber").expectReturnToBe("anAccountNumber").and()
                .callMethod("getName").expectReturnToBe("aName").and()
                .callMethod("getBalance").expectReturnToBe(2000);
    }

    @Test
    void checkCredit() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("credit", 100).expectReturnToBe(2100)
                .and()
                .expectField("balance").toHaveValue(2100);
    }

    @Test
    void checkDebit() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("debit", 100).expectReturnToBe(1900)
                .and()
                .expectField("balance").toHaveValue(1900);
    }

    @Test
    void checkDebitNotEnoughMoney() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("debit", 3000).expectReturnToBe(2000)
                .and()
                .expectField("balance").toHaveValue(2000);
    }

    @Test
    void checkTransfer() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object otherBankAccount = onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("transfer", otherBankAccount, 500).expectReturnToBe(1500)
                .and().expectField("balance").toHaveValue(1500);

        Object otherBalance = otherBankAccount.getClass().getMethod("getBalance").invoke(otherBankAccount);
        Assertions.assertThat(otherBalance).isEqualTo(2500);
    }

    @Test
    void checkTransferLowBalance() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object otherBankAccount = onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("transfer", otherBankAccount, 4000).expectReturnToBe(2000)
                .and().expectField("balance").toHaveValue(2000);

        Object otherBalance = otherBankAccount.getClass().getMethod("getBalance").invoke(otherBankAccount);
        Assertions.assertThat(otherBalance).isEqualTo(2000);
    }

    @Test
    void checkToString() {
        onClass(CLASS_NAME)
                .callConstructor("anAccountNumber", "aName", 2000)
                .callMethod("toString").expectReturnToBe("BankAccount{accountNumber='anAccountNumber', name='aName', balance=2000}");
    }
}
