package LabFinalFA23HaleemaBinteJamil;

class ConcreteObserverParents implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Parents received message: " + message);
    }
}
