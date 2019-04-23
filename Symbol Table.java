import java.io.*;

class st
{
 FileInputStream fin= new FileInputStream("Sp.txt");
 DataInputStream in= new DataInputStream(fin);
 BufferedReader d = new BufferedReader(new InputStreamReader(in));
 String s[]=new String[20]; int n,i;
 String st[][]=new String[20][20]; int top2;
 int j,lc,reg,f1,f2,f3;
 boolean flag;
 
 st()throws IOException
 {
  i=top2=-1;
  String temp=d.readLine();
  while(temp!=null)
  {
   s[++i]=temp;
   temp=d.readLine();
  }
  n=i;
 
 }
 
 void initialize()
 {
  String psedo_char[]={ "START" , "USING" , "DROP" , "EQU" , "END" , "DS" , "DC" };
  String mcop[]={ "A" , "L" , "ST" , "MVC" };
  String dtype[]= { "DS" , "DC" };
  compute(psedo_char,mcop,dtype);
  display();
 }
 
 void compute(String psedo_char[],String mcop[],String dtype[])
 {
  int p1,p2,p3,p4;
  String s1;
  char c1;
  f1=f2=f3=-1;
  boolean f6=false;
  lc=0;
  flag=true;
  
  for(i=0;i<=n;i++)
  {
   f1=s[i].indexOf("START");
   f2=s[i].indexOf("USING");
   f3=s[i].indexOf("L ");
   findlc();
   
    //ST
   p1=s[i].charAt(0);
   if(p1!=' ')
   {
    p2=s[i].indexOf(" ");
    flag=check(st,top2,s[i].substring(0,p2));
    if(flag)
    {
     st[++top2][0]=s[i].substring(0,p2);
     st[top2][1]=Integer.toHexString(lc);
     st[top2][2]="1";
     st[top2][3]="R";
    }
   }    
  }
  

 }
  
 void findlc()
 {
  if( (f1==-1 && f2==-1 && f3==-1) )
  lc=lc+4;  
 }
 
 boolean check(String ax[][],int ptr,String st)
     {
      boolean flag1=false;
      if(ptr!=-1)
      {
       for(int l=0;l<=ptr;l++)
       if(ax[l][0].equals(st))
       {
        flag1=true;
        break;
       }
       if(flag1)
       return false;
       else
       return true;
      }
      else
      return true;
     }
 
 void display()
 {
  System.out.println("\nGiven Source Code:");
  System.out.println();
  for(i=0;i<=n;i++)
  System.out.println(s[i]);
  
  
  
  System.out.println("\nST:");
  System.out.println("Symbol\t\tValue\t\tLength\t\tRelocation");
  System.out.println();
  for(i=0;i<=top2;i++)
  System.out.println(st[i][0]+"\t\t"+st[i][1]+"\t\t"+st[i][2]+"\t\t"+st[i][3]);
 
 }
 
 public static void main(String args[])throws IOException
 {
  st as=new st();
  as.initialize();
 }
}
