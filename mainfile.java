import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class main {
	public static void present() {
		Scanner input=new Scanner(System.in);
		int principal,time,rate,n;
		String v;
		double i;
		
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		try {
		out.write("enter the principal amount value : ");
		out.flush();
		principal=input.nextInt();
		out.write("enter the time value : ");
		out.flush();
		time=input.nextInt();
		out.write("enter the rate value : ");
		out.flush();
		rate=input.nextInt();
		out.write("enter the no .of times value : ");
		out.flush();
		n=input.nextInt();
	    i=simpleinterest.calculate(principal,time,rate);
	    
		 v=Double.toString(i);
		out.write("Simple Interest : "+v+"\n\n");
		out.flush();
		i=compoundinterest.calculate(principal,time,rate,n);
		v=Double.toString(i);
		out.write("Compound Interest : "+v);
		out.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}

		
		
	}
}
