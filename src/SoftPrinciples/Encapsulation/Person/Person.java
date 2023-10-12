package SoftPrinciples.Encapsulation.Person;

public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  
            this.age = age;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person person = new Person("Binte Jamil", 21);

        System.out.println("Original Name: " + person.getName());
        person.setName("Haleema");
        System.out.println("Updated Name: " + person.getName());

        System.out.println("Original Age: " + person.getAge());
        person.setAge(-5);  
        System.out.println("Updated Age: " + person.getAge());

        person.displayInfo();
    }
}