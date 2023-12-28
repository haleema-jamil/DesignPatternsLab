package LabFinalFA23HaleemaBinteJamil;

class ConcreteObserverTeachers implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Teachers received message: " + message);
    }
}
