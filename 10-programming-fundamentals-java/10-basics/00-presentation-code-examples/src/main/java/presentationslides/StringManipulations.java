package presentationslides;

public class StringManipulations {

    public static void main(String[] args) {
        String myNickname = "Coolio";
        int numberOfChars = myNickname.length();
        System.out.println(numberOfChars);

        String firstname = "John";
        String lastname = " Johnson";
        String fullName1 = firstname.concat(lastname);
        String fullName2 = firstname.concat(" Johnson");
        String fullName3 = "John".concat(lastname);
        String fullName4 = "John".concat(" Johnson");

        int combinedCharValue = 'A' + 'B';

        String myName = "John Doe";
        String firstName = myName.substring(0, 4);
        System.out.println(firstName);

        int indexOfN = myName.indexOf('n');
        System.out.println(indexOfN);

        String aName = "John";
        String anotherName = "john";
        boolean isEqual = aName.equals(anotherName);
        System.out.println("Are both names equal: " + isEqual);

        String[] favoriteMovieTitles = new String[] { "The Matrix", "Wall-E", "Mr. Bean" };







    }

}
