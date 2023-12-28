package LabFinalFA23HaleemaBinteJamil;

import java.util.ArrayList;
import java.util.List;

class AdmissionSystem {
    private List<Department> departments = new ArrayList<>();
    private List<EligibilityChecker> eligibilityCheckers = new ArrayList<>();
    private List<RecommendationSystem> recommendationSystems = new ArrayList<>();
    private Communication communication = new Communication();

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addEligibilityChecker(EligibilityChecker eligibilityChecker) {
        eligibilityCheckers.add(eligibilityChecker);
    }

    public void addRecommendationSystem(RecommendationSystem recommendationSystem) {
        recommendationSystems.add(recommendationSystem);
    }

    public void addObserver(Observer observer) {
        communication.addObserver(observer);
    }

    public void coordinateAdmissionProcess(Student student) {
        // Check eligibility with multiple checkers
        boolean isEligible = false;
        for (EligibilityChecker eligibilityChecker : eligibilityCheckers) {
            if (eligibilityChecker.checkEligibility(student)) {
                isEligible = true;
                break;
            }
        }

        if (isEligible) {
            // Generate recommendations using multiple algorithms
            for (RecommendationSystem recommendationSystem : recommendationSystems) {
                String recommendation = recommendationSystem.generateRecommendation(student);
                communication.notifyStakeholders(recommendation);
            }
        } else {
            communication.notifyStakeholders("Student is not eligible for admission.");
        }
    }
}
