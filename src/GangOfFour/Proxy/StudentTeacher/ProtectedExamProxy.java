package GangOfFour.Proxy.StudentTeacher;

class ProtectedExamProxy extends SmartExamProxy {
    private String studentName;

    public ProtectedExamProxy(String studentName) {
        this.studentName = studentName;
    }

    public ExamResult getStudentResult() {
        return getStudentResult(studentName);
    }
}

// Teacher Exam Proxy - Shows all exam results
class TeacherExamProxy extends VirtualExamProxy {
    // No additional logic needed for the teacher proxy
}
