import java.io.*;
import java.util.*;
class code
{
 public static void main(String args[])throws IOException
 {
 String s,t;
 String arr[][]=new String[10][2]; 
 int flag=0,index=0;
 System.out.println("***CODE OPTIMIZATION using Common Sub-Expression Elimination***");
 BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
 File op = new File("output.txt");
 if (!op.exists())
 op.createNewFile();
 BufferedWriter output = new BufferedWriter(new FileWriter(op.getAbsoluteFile()));
 for(;(s=br.readLine())!=null;flag=0)
 {
 t=s.substring(s.indexOf("=")+1);
 for(int i=0;i<index;i++)
 {
 if(t.equals(arr[i][1])) 
 {
 flag=1;
 break;
 }
 else if(t.contains(arr[i][1]))
 s=s.replaceAll(arr[i][1],arr[i][0]);
 } 
 if(flag==0)
 {
 arr[index][0]=s.substring(0,s.indexOf("="));
 arr[index][1]=t;
 index++;
 output.write(s);
 output.newLine();
 }
 }
 output.close();
 }
}

/*
t1=a-b
t2=a-b+d
t3=c-d
t4=a-b+c-d
*/