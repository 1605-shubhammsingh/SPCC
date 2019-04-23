import java.util.*;
public class Codegen {
	public static void main(String args[]) {
		int i=0,a,b;
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3,s4;
		String s = sc.nextLine();
		a = s.indexOf("=");
		b = 3;
		s1 = s.substring(0,a);
		s2 = s.substring(a+1,b);
		s3 = s.substring(b+1);
		s4 = s.substring(b,b+1);
		System.out.println("LDF R"+(++i)+" "+s2);
		System.out.println("LDF R"+(++i)+" "+s3);
		switch(s4) {
		case "*": System.out.println("\nMULF R1,R2");
		break;
		case "+": System.out.println("\nADDF R1,R2");
		break;
		case "-": System.out.println("\nSUBF R1,R2");
		break;
		case "/": System.out.println("\nDIVF R1,R2");
		break;
		}
		System.out.println("STF "+s1+", R1");
		sc.close();
	}
}
