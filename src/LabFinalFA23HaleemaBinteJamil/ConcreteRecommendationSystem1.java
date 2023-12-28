package LabFinalFA23HaleemaBinteJamil;

class ConcreteRecommendationSystem1 implements RecommendationSystem {
    @Override
    public String generateRecommendation(Student student) {
        if (student.getMarksInComputer() > student.getMarksInMaths() && student.getMarksInComputer() > student.getMarksInPhysics()) {
            return "Recommendation for Computer Science (CS) Department";
        } else if (student.getMarksInMaths() > student.getMarksInComputer()) {
            return "Recommendation for Mathematics Department";
        } else if (student.getMarksInMaths() > student.getMarksInPhysics() && student.getMarksInPhysics() > student.getMarksInComputer()) {
            return "Recommendation for Business Administration (BBA) Department";
        } else if (student.getMarksInPhysics() > student.getMarksInMaths()) {
            return "Recommendation for Electrical Engineering (EE) Department";
        } else {
            return "No specific recommendation available.";
        }
    }
}
