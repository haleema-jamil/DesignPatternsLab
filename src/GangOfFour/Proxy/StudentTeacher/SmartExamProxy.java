package GangOfFour.Proxy.StudentTeacher;

import java.util.ArrayList;
import java.util.List;

class SmartExamProxy extends VirtualExamProxy {
    private List<ExamResult> studentResults;

    public SmartExamProxy() {
        this.studentResults = new ArrayList<>();
    }

    public ExamResult getStudentResult(String studentName) {
        for (ExamResult result : studentResults) {
            if (result.getStudentName().equals(studentName)) {
                return result;
            }
        }

        // If no result exists for the student, create a new one
        ExamResult newResult = new ExamResult(studentName);
        studentResults.add(newResult);
        return newResult;
    }
}
