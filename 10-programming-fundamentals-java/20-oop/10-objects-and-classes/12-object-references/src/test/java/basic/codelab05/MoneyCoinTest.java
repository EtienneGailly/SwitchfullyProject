package basic.codelab05;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyCoinTest {

    private MoneyCoin moneyCoinA = new MoneyCoin(50, "EUR");
    private MoneyCoin moneyCoinB = new MoneyCoin(50, "EUR");
    private MoneyCoin moneyCoinC = new MoneyCoin(50, "eur");
    private MoneyCoin moneyCoinD = new MoneyCoin(45, "EUR");
    private MoneyCoin moneyCoinE = new MoneyCoin(50, "USD");

    @Test
    void coinAEqualsB() {
        Assertions.assertThat(moneyCoinA).isEqualTo(moneyCoinB);
    }

    @Test
    void coinAEqualsC() {
        Assertions.assertThat(moneyCoinA).isEqualTo(moneyCoinC);
    }

    @Test
    void coinANotEqualsD() {
        Assertions.assertThat(moneyCoinA).isNotEqualTo(moneyCoinD);
    }

    @Test
    void coinANotEqualsE() {
        Assertions.assertThat(moneyCoinA).isNotEqualTo(moneyCoinE);
    }
}
