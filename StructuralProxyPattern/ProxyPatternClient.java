package StructuralProxyPattern;

public class ProxyPatternClient {
	public static void main(String[] args) {
	OfficeInternetAccess access=new ProxyInternetAccess("Sravani");
	access.grantInternetAccess();
	}

}
