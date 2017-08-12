    import java.net.*;  
    import java.io.*;  
    class pwd
{  
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String password="Ankit";  
     
    String str="",str2="";  
    while(!str.equals("stop")){  
    str=din.readUTF();  

    System.out.println("client says: "+str);
  
     
if(str.equals(password))
{    
str2="YES";
    dout.writeUTF(str2);
}
else
{
str2="no";
dout.writeUTF(str2);
}
  
    dout.flush();  
    }  
    din.close();  
    s.close();  
    ss.close();  
    }
}  