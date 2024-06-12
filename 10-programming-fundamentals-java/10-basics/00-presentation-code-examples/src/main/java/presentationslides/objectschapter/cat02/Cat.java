package presentationslides.objectschapter.cat02;

public class Cat {

    public String color;
    public int birthDate;

    public Cat(String color, int birthDate) {
        this.color = color;
        this.birthDate = birthDate;
    }

    public String meow() {
        if(birthDate >= 2019) {
            return "Miew miew miew!";
        } else {
            return "Meeeeoow!";
        }
    }
}
