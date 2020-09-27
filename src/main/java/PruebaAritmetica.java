
public class PruebaAritmetica {

	public static void main(String[] args) {

		int operandoA = 6;
		int operandoB = 2;

		Aritmetica objeto1 = new Aritmetica(operandoA, operandoA);
		System.out.println("operandoA = " + operandoA);
		System.out.println("operandoB= " + operandoB);

		System.out.println("\n Imprimimos resultado de la suma; " + objeto1.sumar());
		System.out.println("\n Imprimimos resultado de la resta; " + objeto1.restar());
		System.out.println("\n Imprimimos resultado de la multiplicación; " + objeto1.multiplicar());
		System.out.println("\n Imprimimos rescultado de la división; " + objeto1.dividir());
	}

}
