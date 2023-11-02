package studio7;

public class Fraction {

	private int numerator;
	private int denominator; 
	
	// constructor 
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator; 
	}
	public Fraction multiply (Fraction otherFraction) {
		int newNumerator = (this.numerator*otherFraction.numerator);
		int newDenominator = (this.denominator * otherFraction.denominator);
		Fraction newFraction = new Fraction (newNumerator, newDenominator);
		return newFraction;
	}
	public Fraction sum(Fraction otherFraction) {
		if (this.denominator == otherFraction.denominator) {
			int newDenominator = this.denominator;
			int newNumerator = (this.numerator + otherFraction.numerator);
			Fraction newFraction = new Fraction (newNumerator,newDenominator);
			return newFraction;
		}else {
			int newDenominator = (this.denominator * otherFraction.denominator);
			int newNumerator = ((this.numerator*otherFraction.denominator)+(otherFraction.numerator*this.denominator));
			Fraction newFraction = new Fraction (newNumerator, newDenominator);
			return newFraction;
		}
		
	}
	
	public Fraction reciprocal() {
		int newDenominator = this.numerator;
		int newNumerator = this.denominator;
		Fraction newFraction = new Fraction (newNumerator, newDenominator);
		return newFraction;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fractionone = new Fraction (1, 2);
		Fraction fractiontwo = new Fraction (1,4);
		Fraction result = fractionone.sum(fractiontwo);
		System.out.println(result.numerator);
		System.out.println(result.denominator);
		
	}

}
