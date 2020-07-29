package java1;

public class Test {

	
	
	@Override
	public String toString() {
		return String.format("Test []");
	}

	public static void main(String[] args) {
		int score = 30;
		char credit = 'F';

		for (score = 0; score <= 100; score += 10) {

			credit = score / 10 == 10 || score / 10 == 9 ? 'A'
					: score / 10 == 8 ? 'B' 
					: score / 10 == 7 ? 'C' 
					: score / 10 == 6 ? 'D'
					: 'F';

			System.out.println(score + " : " + credit);
		}
	}
}
