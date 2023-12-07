package GangOfFour.Proxy.Images;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image imageLoader = new VirtualProxyImageLoader("test_10mb.jpg");
        imageLoader.display();
        System.out.println("");
        imageLoader.display();

        Image imageWithFakeDisplay = new SmartProxyImageWithFakeDisplay("unsupported_type.gif");
        imageWithFakeDisplay.display();

    }
}
