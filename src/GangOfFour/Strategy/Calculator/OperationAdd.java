package GangOfFour.Strategy.Calculator;

public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
   
   @Override
   public int ComputeInRange(int num1, int num2){
       if(num1 <=100 && num1>=0 && num2 <=100 && num2>=0){
           return num1 + num2;
       }
       else {
           
       }
       return 0;
   }
}