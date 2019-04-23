import java.io.*;

class lt
{
  FileInputStream fin= new FileInputStream("Sp.txt");
 DataInputStream in= new DataInputStream(fin);
 BufferedReader d = new BufferedReader(new InputStreamReader(in));
 String s[]=new String[20]; int n,i;
 
 String lt[][]=new String[20][20]; int top3,top4;
 
 int j,lc,reg,f1,f2,f3;
 boolean flag;
 
 lt()throws IOException
 {
  i=top3=top4=-1;
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
   
   
   //POT
   for(j=0;j<7;j++)
   {
    flag=true;
    p1=s[i].indexOf(psedo_char[j]);
    if(p1!=-1)
    {
     boolean f4=psedo_char[j].equals("DC");
     boolean f5=psedo_char[j].equals("DS");
   
     //LT
     if(f4 || f5)
     {
      p3=s[i].lastIndexOf(" ");
      p4=s[i].indexOf(" ");
      lt[++top3][0]=s[i].substring(0,p4);
      lt[top3][1]=s[i].substring(p3+1);
      lt[top3][2]=Integer.toHexString(lc);
      lt[top3][3]="1";
      lt[top3][4]="R";
      
     
     }      
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
  
  
  
  System.out.println("\nLT:");
  System.out.println("Literal\t\tValue\t\tLength\t\tRelocation");
  System.out.println();
  for(i=0;i<=top3;i++)
  System.out.println(lt[i][1]+"\t\t"+lt[i][2]+"\t\t"+lt[i][3]+"\t\t"+lt[i][4]);
  
 
 }
 
 public static void main(String args[])throws IOException
 {
  lt as=new lt();
  as.initialize();
 }
}