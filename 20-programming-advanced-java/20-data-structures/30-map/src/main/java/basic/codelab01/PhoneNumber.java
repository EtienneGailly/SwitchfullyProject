package basic.codelab01;

public class PhoneNumber {
    private final String countryCode;
    private final String coreNumber;

    public PhoneNumber(String countryCode, String coreNumber) {
        this.countryCode = countryCode;
        this.coreNumber = coreNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCoreNumber() {
        return coreNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", coreNumber=" + coreNumber +
                '}';
    }
}
