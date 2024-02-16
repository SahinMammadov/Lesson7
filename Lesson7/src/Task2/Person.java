package Task2;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.id);
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
