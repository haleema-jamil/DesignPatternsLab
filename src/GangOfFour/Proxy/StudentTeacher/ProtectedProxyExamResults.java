package GangOfFour.Proxy.StudentTeacher;

class ProtectedProxyExamResults implements ExamResults {
    private Exam studentExam;

    public ProtectedProxyExamResults(Exam studentExam) {
        this.studentExam = studentExam;
    }

    @Override
    public void displayResults() {
        System.out.println("Displaying Results for Student");
        System.out.println("Exam Name: " + studentExam.getExamName());
        Map<String, String> answers = studentExam.getAllAnswers();
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
