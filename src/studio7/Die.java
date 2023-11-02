package studio7;

public class Die {

	private int n;
	public Die (int n) {
		this.n = n;
	}
	
	public int roll () {
		return (int)(Math.random()*this.n)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(6);
		int result = die.roll();
		System.out.println(result);

	}

}
