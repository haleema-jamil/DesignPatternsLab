package GangOfFour.Proxy.Images;

public class NullImage implements Image {
    private String fileName;
    
    public NullImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Unsupported Image Type: " +fileName);
    }
}
