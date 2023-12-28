package LabFinalFA23HaleemaBinteJamil;

class ConcreteRecommendationSystem2 implements RecommendationSystem {
    @Override
    public String generateRecommendation(Student student) {
        if (student.getTotalMarks() >= 70) {
            return "Recommendation for Business Administration (BBA) Department";
        } else if (student.getTotalMarks() >= 65) {
            return "Recommendation for Mathematics Department";
        } else {
            return "No specific recommendation for this department.";
        }
    }
}
