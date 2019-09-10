public class Factorial{
	
	public int calculate(int number){
		if( number <=1 ) return 1;
		return number * calculate(number-1);
	}

}
