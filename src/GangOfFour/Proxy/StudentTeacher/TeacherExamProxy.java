package GangOfFour.Proxy.StudentTeacher;

import java.util.List;

class TeacherExamProxy extends VirtualExamProxy {

    public List<ExamResult> getAllResults() {
        return super.getExamResults();
    }
}
