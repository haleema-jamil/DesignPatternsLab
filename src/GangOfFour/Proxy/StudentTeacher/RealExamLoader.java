package GangOfFour.Proxy.StudentTeacher;

import java.util.Arrays;
import java.util.List;

class RealExamLoader implements ExamLoader {
    private String examName;

    public RealExamLoader(String examName) {
        this.examName = examName;
    }

    @Override
    public Exam loadExam() {
        // Simulate loading an exam from a database or file
        List<String> questions = Arrays.asList("Question1", "Question2", "Question3");
        return new MathExam(examName, questions);
    }
}
