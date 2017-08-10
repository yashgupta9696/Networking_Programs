import java.io.*;
import java.net.*;
public class ipad {
 
 
    public static void main(String args[]) throws UnknownHostException {
   
        InetAddress addr = InetAddress.getLocalHost();
     
        
        String ipAddress = addr.getHostAddress();
     
        System.out.println("IP address of localhost from Java Program: " + ipAddress);
     
       
        String hostname = addr.getHostName();
        System.out.println("Name of hostname : " + hostname);
     
    }
 
}


