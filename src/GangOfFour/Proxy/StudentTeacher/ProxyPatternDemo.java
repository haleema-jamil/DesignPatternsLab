package GangOfFour.Proxy.StudentTeacher;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Student
        Exam studentExam = new ProxyExam("Student");
        studentExam.conductExam();
        ((ProxyExam) studentExam).viewResults(); // Student can only view their own result

        // Teacher
        Exam teacherExam = new ProxyExam("Teacher");
        ((ProxyExam) teacherExam).viewResults(); // Teacher can view all results
    }
}