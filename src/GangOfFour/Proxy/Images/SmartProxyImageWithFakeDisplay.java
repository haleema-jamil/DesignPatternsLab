package GangOfFour.Proxy.Images;

public class SmartProxyImageWithFakeDisplay implements Image {

    private RealImage realImage;
    private String fileName;

    public SmartProxyImageWithFakeDisplay(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        // Fake display for unsupported image types
        if (fileName.endsWith(".gif")) {
            System.out.println("Displaying " + fileName + " (Fake Display for Unsupported Type)");
        } else {
            realImage.display();
        }
    }
}
