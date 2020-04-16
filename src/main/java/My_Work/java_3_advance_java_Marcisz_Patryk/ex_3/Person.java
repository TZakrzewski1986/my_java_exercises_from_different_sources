package My_Work.java_3_advance_java_Marcisz_Patryk.ex_3;

public class Person {

    private String name;
    private String lastName;
    private double pesel;

    Person(String name, String lastName, double pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    Person(Person person) {
        this.name = person.name;
        this.lastName = person.lastName;
        this.pesel = person.pesel;
    }

    public String przedstawSie() { return name + " " + lastName;}

    @Override
    public String toString() {
        return "Osoba" +
                " o imieniu " + name + '\'' +
                " i nazwisku" + lastName + '\'' +
                " ,oraz PESELU" + pesel + '\'';
    }


}
