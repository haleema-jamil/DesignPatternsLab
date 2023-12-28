package LabFinalFA23HaleemaBinteJamil;

class Student {
    private String name;
    private String address;
    private float marksInComputer;
    private float marksInMaths;
    private float marksInPhysics;
    private float FSCmarks;
    private float totalMarks;
    private int education;

    public Student(String name, String address, float marksInComputer, float marksInMaths, float marksInPhysics, float FSCmarks, float totalMarks, int education) {
        this.name = name;
        this.address = address;
        this.marksInComputer = marksInComputer;
        this.marksInMaths = marksInMaths;
        this.marksInPhysics = marksInPhysics;
        this.FSCmarks = FSCmarks;
        this.totalMarks = totalMarks;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getMarksInComputer() {
        return marksInComputer;
    }

    public float getMarksInMaths() {
        return marksInMaths;
    }

    public float getMarksInPhysics() {
        return marksInPhysics;
    }

    public float getFSCmarks() {
        return FSCmarks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public void applyForAdmission() {
        // Implementation for applying for admission
    }

    public boolean checkEligibility(EligibilityChecker eligibilityChecker) {
        return eligibilityChecker.checkEligibility(this);
    }

    public String getRecommendation(RecommendationSystem recommendationSystem) {
        return recommendationSystem.generateRecommendation(this);
    }
}
