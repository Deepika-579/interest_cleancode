import java.lang.*;

public class compoundinterest {
public static double calculate(int principal,int time ,int rate,int numtimes) {
	
	return (principal*Math.pow(((float) (rate/100.0)/numtimes)+1,numtimes*time));
}
}
