import java.io.*;
import java.net.*;
class RunCmd{
public static void main(String args[])throws Exception{
String s;
Scanner in=new Scanner(System.in);
System.out.print("Enter the command and press enter:");
String cmd=in.nextLine();
Process p=Runtime.getRuntime().exec(cmd);
BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
while((s=br.readLine())!=null)
System.out.println(s);
}
}
