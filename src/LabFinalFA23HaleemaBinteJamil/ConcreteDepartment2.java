package LabFinalFA23HaleemaBinteJamil;

class ConcreteDepartment2 implements Department {
    @Override
    public RecommendationSystem createRecommendationAlgorithm() {
        return new ConcreteRecommendationSystem2();
    }
}
