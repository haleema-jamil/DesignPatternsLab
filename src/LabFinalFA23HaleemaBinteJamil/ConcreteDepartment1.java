package LabFinalFA23HaleemaBinteJamil;

class ConcreteDepartment1 implements Department {
    @Override
    public RecommendationSystem createRecommendationAlgorithm() {
        return new ConcreteRecommendationSystem1();
    }
}
