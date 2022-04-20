public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Возраст человека не может быть меньше нуля!");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() {
        Person person = new Person(name, surname, age);
        person.setAddress(this.address);

        if (person.name == null || person.surname == null) {
            throw new IllegalArgumentException("У человека должны быть имя и фамилия");
        }

        if (person.hasAge()) {
            return person;
        }
        return new Person(name, surname);
    }
}
