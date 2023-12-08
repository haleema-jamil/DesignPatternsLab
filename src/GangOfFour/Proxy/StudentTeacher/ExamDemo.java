package GangOfFour.Proxy.StudentTeacher;

import java.util.List;

public class ExamDemo {
    public static void main(String[] args) {
        VirtualExamProxy virtualProxy = new VirtualExamProxy();

        SmartExamProxy smartProxy1 = new SmartExamProxy();
        ExamResult studentResult1 = smartProxy1.getStudentResult("Student1");
        studentResult1.addAnswer("Answer1");
        studentResult1.addAnswer("Answer2");

        SmartExamProxy smartProxy2 = new SmartExamProxy();
        ExamResult studentResult2 = smartProxy2.getStudentResult("Student2");
        studentResult2.addAnswer("Answer3");
        studentResult2.addAnswer("Answer4");

        SmartExamProxy smartProxy3 = new SmartExamProxy();
        ExamResult studentResult3 = smartProxy3.getStudentResult("Student3");
        studentResult3.addAnswer("Answer5");
        studentResult3.addAnswer("Answer6");

        ProtectedExamProxy protectedProxy1 = new ProtectedExamProxy("Student1");
        ExamResult result1 = protectedProxy1.getStudentResult();
        System.out.println("Student 1's Results: " + result1.getAnswers());

        ProtectedExamProxy protectedProxy2 = new ProtectedExamProxy("Student2");
        ExamResult result2 = protectedProxy2.getStudentResult();
        System.out.println("Student 2's Results: " + result2.getAnswers());

        TeacherExamProxy teacherProxy = new TeacherExamProxy();
        List<ExamResult> allResults = teacherProxy.getExamResults();
        System.out.println("Teacher's View of Results:");
        for (ExamResult result : allResults) {
            System.out.println(result.getStudentName() + ": " + result.getAnswers());
        }
    }
}