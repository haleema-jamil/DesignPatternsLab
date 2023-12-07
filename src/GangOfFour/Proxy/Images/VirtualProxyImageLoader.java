package GangOfFour.Proxy.Images;

public class VirtualProxyImageLoader implements Image {

    private RealImage realImage;
    private String fileName;

    public VirtualProxyImageLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
