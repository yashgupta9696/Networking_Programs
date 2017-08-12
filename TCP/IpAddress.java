import java.net.*;
public class IpAddress {
public static void main (String[] args) {
try {
InetAddress address[] = InetAddress.getAllByName("www.google.com");
for(int i=0;i<address.length;i++)
System.out.println(address[i]);
}
catch (UnknownHostException e) {
System.out.println("Could not find...");
}
}
}
