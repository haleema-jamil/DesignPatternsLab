package LabFinalFA23HaleemaBinteJamil;

class ConcreteObserverStudents implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Students received message: " + message);
    }
}
