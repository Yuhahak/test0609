package project2;

import java.util.Scanner;

public class Calculator implements ICalculator{
	int oper;
	
	@Override
	public String inputVal() {
		Scanner s = new Scanner(System.in);
		System.out.println("수식을 입력하여 주세요.");
		return s.nextLine();
	}

	@Override
	public int operLoc(String inp) {
		int plus = inp.indexOf("+");
		int minus = inp.indexOf("-");
		int div = inp.indexOf("/");
		int mul = inp.indexOf("*");
		
		if(plus == -1 && minus == -1 && div == -1 && mul == -1) {
			return -1;
		}
		
		if(plus != -1) {
			oper = 1;
			return plus;
		}
		else if(minus != -1) {
			oper = 2;
			return minus;
		}
		else if(div != -1) {
			oper = 3;	
			return div;
		}
		else {
			oper = 4;
			return mul;
		}
	}

	@Override
	public double getVal(double a, int oper, double b) {
		if(oper == 1) {
			return a+b;
		}
		else if(oper == 2) {
			return a-b;
		}
		else if(oper == 3) {
			return a/b;
		}
		else { 
			return a*b;
		}
	}

	public static void main(String[] args) {
		Calculator ca = new Calculator();
		String strCal = ca.inputVal();
		int operL = ca.operLoc(strCal);
		
		if(operL == -1) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		double a = Double.parseDouble(strCal.substring(0, operL));
		double b = Double.parseDouble(strCal.substring(operL+1));
		System.out.println("값은 : " + ca.getVal(a, ca.oper, b) + " 입니다.");
	}
}
