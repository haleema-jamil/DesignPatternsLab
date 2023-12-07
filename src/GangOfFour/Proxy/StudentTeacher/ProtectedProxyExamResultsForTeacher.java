package GangOfFour.Proxy.StudentTeacher;

import java.util.Map;

class ProtectedProxyExamResultsForTeacher extends ProtectedProxyExamResults {
    private String teacherId;

    public ProtectedProxyExamResultsForTeacher(Exam studentExam, String teacherId) {
        super(studentExam);
        this.teacherId = teacherId;
    }

    @Override
    public void displayResults() {
        if ("Teacher123".equals(teacherId)) {
            // Teacher can view all results
            System.out.println("Displaying All Results for Teacher");
            System.out.println("Exam Name: " + super.studentExam.getExamName());
            Map<String, String> answers = super.studentExam.getAllAnswers();
            for (Map.Entry<String, String> entry : answers.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            // Other teachers cannot view all results
            System.out.println("Access Denied. Teacher " + teacherId + " can only view their own results.");
        }
    }
}
