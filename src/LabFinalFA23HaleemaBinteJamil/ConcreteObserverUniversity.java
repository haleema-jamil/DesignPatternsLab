package LabFinalFA23HaleemaBinteJamil;

class ConcreteObserverUniversity implements Observer {
    @Override
    public void update(String message) {
        System.out.println("University received message: " + message);
    }
}
