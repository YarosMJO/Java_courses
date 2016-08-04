import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class calculate{
public static void main(String [] arg)throws Exception{
System.out.println("Plus");
int first =Integer.valueOf(arg[0]);
int second =Integer.valueOf(arg[1]);
int summ =first+second;
System.out.println("sum"+summ);
System.out.println("devide");
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String r = reader.readLine();
int a=Integer.parseInt(r);
a=a-1;
System.out.println(a);
System.out.println("n*N");
String r1 = reader.readLine();
int b=Integer.parseInt(r1);
b=b*2;
System.out.println(b);
System.out.println("n/N");
String r2 = reader.readLine();
int c=Integer.parseInt(r2);
c=c/3;
System.out.println(c);

}

}
