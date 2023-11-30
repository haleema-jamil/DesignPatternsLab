package GangOfFour.Prototypes.Shapes;

public class Avatar extends Shape {
    public Avatar(){
        type = "Avatar";
    }

    @Override
    void draw() {
        System.out.println("Inside Avatar::draw() method.");
    }
    
}
