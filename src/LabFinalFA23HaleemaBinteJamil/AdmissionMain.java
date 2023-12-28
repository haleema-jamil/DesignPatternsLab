package LabFinalFA23HaleemaBinteJamil;

public class AdmissionMain {
    public static void main(String[] args) {
        // Create instances of various classes and test the system
        AdmissionSystem admissionSystem = new AdmissionSystem();

        ConcreteDepartment1 department1 = new ConcreteDepartment1();
        ConcreteDepartment2 department2 = new ConcreteDepartment2();

        ConcreteEligibilityChecker1 eligibilityChecker1 = new ConcreteEligibilityChecker1();
        ConcreteEligibilityChecker2 eligibilityChecker2 = new ConcreteEligibilityChecker2();

        ConcreteRecommendationSystem1 recommendationSystem1 = new ConcreteRecommendationSystem1();
        ConcreteRecommendationSystem2 recommendationAlgorithm2 = new ConcreteRecommendationSystem2();

        admissionSystem.addDepartment(department1);
        admissionSystem.addDepartment(department2);

        admissionSystem.addEligibilityChecker(eligibilityChecker1);
        admissionSystem.addEligibilityChecker(eligibilityChecker2);

        admissionSystem.addRecommendationSystem(recommendationSystem1);
        admissionSystem.addRecommendationSystem(recommendationAlgorithm2);

        ConcreteObserverUniversity universityObserver = new ConcreteObserverUniversity();
        ConcreteObserverTeachers teachersObserver = new ConcreteObserverTeachers();
        ConcreteObserverStudents studentsObserver = new ConcreteObserverStudents();
        ConcreteObserverParents parentsObserver = new ConcreteObserverParents();

        admissionSystem.addObserver(universityObserver);
        admissionSystem.addObserver(teachersObserver);
        admissionSystem.addObserver(studentsObserver);
        admissionSystem.addObserver(parentsObserver);

        Student student = new Student("Haleema", "Mansehra", 85, 75, 70,75, 400, 12);

        admissionSystem.coordinateAdmissionProcess(student);
    }
}
