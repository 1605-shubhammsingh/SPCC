import java.io.*;

class bt
{
 FileInputStream fin= new FileInputStream("Sp.txt");
 DataInputStream in= new DataInputStream(fin);
 BufferedReader d = new BufferedReader(new InputStreamReader(in));
 String s[]=new String[20]; int n,i;
 
 String bt[][]=new String[20][2];
 
 int j,lc,reg,f1,f2,f3;
 boolean flag;
 
 bt()throws IOException
 {
  i=-1;
  String temp=d.readLine();
  while(temp!=null)
  {
   s[++i]=temp;
   temp=d.readLine();
  }
  n=i;
  
  for(j=0;j<=15;j++)
  {
   bt[j][0]="N";
   bt[j][1]="-";
  }
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
    
   //POT
   for(j=0;j<7;j++)
   {
    flag=true;
    p1=s[i].indexOf(psedo_char[j]);
    if(p1!=-1)
    {
     f6=psedo_char[j].equals("USING");
    
         
     if(f6)
     {
      p2=s[i].indexOf(",");
      reg=Integer.parseInt(s[i].substring(p2+1));
     }
          
    }
   }
   
     
  }
  
  //BT
  bt[reg][0]="Y";
  bt[reg][1]="000";
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
  
 
  System.out.println("\nBT:");
  System.out.println("Indicator\tAvailable"/*\tRelative addr"*/);
  System.out.println();
  for(i=0;i<=15;i++)
  System.out.println(i+"\t\t "+bt[i][0]/*+"\t\t "+bt[i][1]*/);
  
 
 }
 
 public static void main(String args[])throws IOException
 {
 bt as=new bt();
 as.initialize();
 }
}