package View;

import java.util.Scanner;

import Controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		OperacoesController Op = new OperacoesController();
		
		int N;
		
		do {
			N = sc.nextInt();
		} while (N > 10);
		
		System.out.println(Op.function(N));
	}
}
