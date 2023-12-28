package LabFinalFA23HaleemaBinteJamil;

class ConcreteEligibilityChecker2 implements EligibilityChecker {
    @Override
    public boolean checkEligibility(Student student) {
        int minEducation = 12;

        return student.getEducation() >= minEducation;
    }
}
