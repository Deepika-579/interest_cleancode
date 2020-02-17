
public class simpleinterest {
public static  double calculate(int principal,int time,int rate) {
	double value=0;
	value=(float) (principal*time*rate)/100.0;
	value+=principal;
	
	
	return value;
}
}
