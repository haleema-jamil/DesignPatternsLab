package GangOfFour.Proxy.StudentTeacher;

import java.util.ArrayList;
import java.util.List;

class VirtualExamProxy {
    private List<ExamResult> examResults;

    public VirtualExamProxy() {
        this.examResults = loadExam();
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }

    private List<ExamResult> loadExam() {
        // Simulate loading exam questions
        List<ExamResult> examResults = new ArrayList<>();
        examResults.add(new ExamResult("Student1"));
        examResults.add(new ExamResult("Student2"));
        examResults.add(new ExamResult("Student3"));
        // Add more students...

        return examResults;
    }
}

