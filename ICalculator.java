package project2;

public interface ICalculator {
	
	abstract String inputVal();
	
	abstract int operLoc(String inp); 
	
	abstract double getVal(double a, int oper, double b);
}