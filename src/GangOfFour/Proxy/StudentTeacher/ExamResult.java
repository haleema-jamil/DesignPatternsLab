package GangOfFour.Proxy.StudentTeacher;

import java.util.ArrayList;
import java.util.List;

class ExamResult {
    private String studentName;
    private List<String> answers;

    public ExamResult(String studentName) {
        this.studentName = studentName;
        this.answers = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void addAnswer(String answer) {
        answers.add(answer);
    }
}
