import java.net.*;
import java.io.*;
import java.util.*;
class DateServer1
 {
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(5217);
        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket s=ss.accept();
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF((new Date()).toString());
            dout.close();
            s.close();
        }    
    }
}