import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return !address.equals("");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBrithday() {
        age++;
    }

    @Override
    public String toString() {
        return  name + " " + surname + ", возраст " +  age + ", " + "город проживания " + address ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

    public PersonBuilder newChildBuilder() {

        PersonBuilder child = new PersonBuilder();
        child.setAge(1);
        child.setSurname(getSurname());
        child.setAddress(getAddress());
        return child;
    }
}
