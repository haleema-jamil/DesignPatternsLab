package SoftPrinciples.Association.University;

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private University university;

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }
}

public class Association {
    public static void main(String[] args) {

        University university = new University("COMSATS Abbottabad");

        Student student1 = new Student("Haleema", university);
        Student student2 = new Student("Marwa", university);

        System.out.println(student1.getName() + " is a student at " + student1.getUniversity().getName());
        System.out.println(student2.getName() + " is a student at " + student2.getUniversity().getName());
    }
}