package basic.solutions.codelab01;

/**
 * You don't have to change anything in this class.
 */
class TaxiCompany {

    private Taxi availableTaxi;

    TaxiCompany() {
    }

    TaxiCompany(Taxi availableTaxi) {
        this.availableTaxi = availableTaxi;
    }

    Taxi sendTaxi() {
        return availableTaxi;
    }

    Taxi getAvailableTaxi() {
        return availableTaxi;
    }
}
