package GangOfFour.Proxy.StudentTeacher;

class VirtualProxyExamLoader implements ExamLoader {
    private RealExamLoader realExamLoader;
    private String examName;

    public VirtualProxyExamLoader(String examName) {
        this.examName = examName;
    }

    @Override
    public Exam loadExam() {
        if (realExamLoader == null) {
            realExamLoader = new RealExamLoader(examName);
        }
        return realExamLoader.loadExam();
    }
}
