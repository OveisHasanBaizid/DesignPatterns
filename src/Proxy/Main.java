package Proxy;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
