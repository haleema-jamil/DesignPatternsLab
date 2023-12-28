package LabFinalFA23HaleemaBinteJamil;

class ConcreteEligibilityChecker1 implements EligibilityChecker {
    @Override
    public boolean checkEligibility(Student student) {
        float minFSCmarks = 60;
        int minTotalMarks = 1200;

        return student.getFSCmarks() >= minFSCmarks &&
               student.getTotalMarks() >= minTotalMarks;
    }
}
