package advanced;

import org.junit.jupiter.api.Test;

import static advanced.DecisionMakingCodelab01.calculateTaxRate;
import static org.assertj.core.api.Assertions.assertThat;

public class DecisionMakingCodelab01Test {

    @Test
    public void ifEarningsLessThanOrEqualTo40000_ThenTaxRatePoint2() {
        assertThat(calculateTaxRate(20000, 3000, true, 4)).isEqualTo(.2);
    }

    @Test
    public void ifFringeBenefitsLessThan2000_ThenTaxRatePoint3() {
        assertThat(calculateTaxRate(50000, 1900, true, 4)).isEqualTo(.3);
    }

    @Test
    public void ifNoDependentChildren_ThenTaxRatePoint4() {
        assertThat(calculateTaxRate(50000, 2100, false, 4)).isEqualTo(.4);
    }

    @Test
    public void ifMoreThan5VacationDays_ThenTaxRatePoint35() {
        assertThat(calculateTaxRate(50000, 2100, true, 6)).isEqualTo(.35);
    }

    @Test
    public void ifLessThan5000FringeBenefits_ThenTaxRatePoint33() {
        assertThat(calculateTaxRate(50000, 2100, true, 4)).isEqualTo(.33);
    }

    @Test
    public void ifNoneOfTheAbove() {
        assertThat(calculateTaxRate(50000, 6000, true, 4)).isEqualTo(.34);
    }
}
