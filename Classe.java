import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] num, v3;
		num = new int[4];
		int[] nume;
		nume = new int[4];
		for (int i = 0; i < num.length; i++) {
			System.out.println("1) digite o numero:");
			num[i] = scanner.nextInt();
			
		}

		for (int o = 0; o < nume.length; o++) {
			System.out.println("2) digite o numero:");
			nume[o] = scanner.nextInt();
			
		}
		
		v3 = soma(num, nume);
		for(int q = 0; q < v3.length; q++){
		System.out.println("soma " + q + ": " + v3[q]);
		}
		
		scanner.close();
		
			
		}
			public static int [] soma(int [] num, int [] nume) {
				int [] numu;
				numu = new int[4];
				for(int p=0; p < numu.length; p++) {
				numu[p] = num[p] + nume[p];
				}
				return numu;
	}
}