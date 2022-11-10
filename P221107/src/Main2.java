
public class Main2 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 81, 82, 85, 70, 75, 69, 79, 99, 12, 13, 26, 57, 35 };

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
		}

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("sum : " + sum);
		double avg = (double) sum / 10;
		System.out.println("avg : " + avg);
	}

}
