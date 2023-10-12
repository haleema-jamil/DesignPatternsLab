public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      HexaObserver observer1 = new HexaObserver(subject);
      OctalObserver observer2 = new OctalObserver(subject);
      BinaryObserver observer3 = new BinaryObserver(subject);


      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
      subject.detach(observer1);
      
      System.out.println("First state change: 5");	
      subject.setState(5);
      
   }
}