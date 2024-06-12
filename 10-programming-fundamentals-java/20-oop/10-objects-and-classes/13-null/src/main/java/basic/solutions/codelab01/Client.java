package basic.solutions.codelab01;

public class Client {

    /**
     * Execute this code. See how it crashes during runtime...
     * The output will show at what line it went wrong. All the code that should have been executed after that line,
     * will not have been executed.
     * <p>
     * Make sure you understand what went wrong. Look at what exceptional behavior (exception) occurred.
     * <p>
     * Then, change the code in the main method to deal with the situation that triggered the exception.
     * - (Don't change the following statement: TaxiCompany blueTaxiCompany = new TaxiCompany();)
     * <p>
     * The output should be as follows:
     * My name is Jim
     * I'm going to order a taxi and then let it take me somewhere!
     * I am driving to Central Park, NY - Manhattan
     * My name is Walter
     * I'm going to order another taxi from another company and let it take me somewhere as well
     * Looks like there's no taxi available...
     */
    public static void main(String[] args) {
        System.out.println("My name is Jim");
        System.out.println("I'm going to order a taxi and then let it take me somewhere!");

        TaxiCompany yellowTaxiCompany = new TaxiCompany(new Taxi());
        Taxi taxi = yellowTaxiCompany.sendTaxi();
        taxi.driveToLocation("Central Park, NY - Manhattan");

        System.out.println("My name is Walter");
        System.out.println("I'm going to order another taxi from another company and let it take me somewhere as well");

        TaxiCompany blueTaxiCompany = new TaxiCompany();
        Taxi anotherTaxi = blueTaxiCompany.sendTaxi();
        if (anotherTaxi == null) {
            System.out.println("Looks like there's no taxi available...");
        } else {
            anotherTaxi.driveToLocation("Central Station, Brussels");
        }
    }

}
