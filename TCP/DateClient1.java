import java.io.*;
import java.net.*;
class DateClient1{
    public static void main(String args[]) throws Exception{
        Socket s=new Socket("localhost",5217);        
        DataInputStream din=new DataInputStream(s.getInputStream());
        System.out.println(din.readUTF());
		
    }    
}
