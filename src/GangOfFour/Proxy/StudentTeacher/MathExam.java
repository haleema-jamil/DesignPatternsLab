package GangOfFour.Proxy.StudentTeacher;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MathExam implements Exam {
    private String examName;
    private List<String> questions;
    private Map<String, String> answers;

    public MathExam(String examName, List<String> questions) {
        this.examName = examName;
        this.questions = questions;
        this.answers = new HashMap<>();
    }

    @Override
    public void addAnswer(String question, String answer) {
        if (questions.contains(question)) {
            answers.put(question, answer);
        } else {
            System.out.println("Invalid question: " + question);
        }
    }

    // Additional methods for ExamResults
    public Map<String, String> getAllAnswers() {
        return Collections.unmodifiableMap(answers);
    }

    public String getExamName() {
        return examName;
    }
}
