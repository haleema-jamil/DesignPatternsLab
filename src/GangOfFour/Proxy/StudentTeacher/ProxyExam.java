package GangOfFour.Proxy.StudentTeacher;

import GangOfFour.Proxy.StudentTeacher.RealExam;

public class ProxyExam implements Exam {
    private RealExam realExam;
    private String studentName;

    public ProxyExam(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void conductExam() {
        if (realExam == null) {
            realExam = new RealExam();
        }
        realExam.conductExam();
    }

    public String viewResults() {
        if (realExam != null) {
            if (studentName.equals("Teacher")) {
                // Display all results to the teacher
                return realExam.getResults().toString();
            } else {
                // Display only the student's result
                return realExam.getResults().getOrDefault(studentName, "Result not available");
            }
        } else {
            return "Exam not conducted yet";
        }
    }
}