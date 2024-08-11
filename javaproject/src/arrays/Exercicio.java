package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7;
		notasAlunoA[1] = 8.9;
		notasAlunoA[2] = 9.5;
		notasAlunoA[3] = 7.5;
		
		String valoresDosArrays = Arrays.toString(notasAlunoA);
		System.out.println(valoresDosArrays);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = {8.2, 7.3, 4.9, notaArmazenada};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB/ notasAlunoB.length);
	}
}
