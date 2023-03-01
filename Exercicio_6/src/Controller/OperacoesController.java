package Controller;

public class OperacoesController {
	
	public double function(double N) {
		//Condição de Parada: Quando o valor informado chegar á zero.
		if (N == 0) {
			return 1;
		} else {
			return 1 / fatorial(N) + function (N - 1);//Retorna a soma da divisão com o fatorial e diminui em 1 o valor de N. 
		}
	}
	
	public double fatorial(double N) {
		if (N == 1) {
			return 1;
		} else {
			return N * fatorial(N - 1);
		}
	}
}
