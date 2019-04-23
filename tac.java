import java.util.*;
public class tac {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a[] = new String[20];
		String op[] = {"+","-","*","/","%","^"};
		String m[] = new String[10];
		String n[] = {"t0","t1","t2","t3","t4","t5"};
		String in;
		int count = 0;
		in = sc.next();
		a = in.split("");
		System.out.println("Three Address Code");
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<op.length;j++){
				if(a[i].equals(op[j])) {
					if(count==0) {
						System.out.println("t0 = "+a[i-1]+a[i]+a[i+1]+";");
						
					}
					else {
						System.out.println(n[count]+" = "+n[count-1]+a[i]+a[i+1]+";");
					}
					count++;
				}
			}
		}
		sc.close();
	}
}
