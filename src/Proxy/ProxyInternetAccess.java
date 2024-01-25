package Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private final String employeeName;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            RealInternetAccess realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName) {
        return 9;
    }
}
