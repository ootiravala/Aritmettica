
public class Aritmetica {

	int a;
	int b;

	public Aritmetica() {
		System.out.println("Ejecutando constructor vacío");
	}

	public Aritmetica(int arg1, int arg2) {
		a = arg1;
		b = arg2;
		System.out.println("Ejecutando constructor con dos argumentos");
	}

	public int sumar() {
		return this.a + this.b;

	}

	public int restar() {
		return this.a - this.b;
	}

	public int multiplicar() {
		return this.a * this.b;
	}

	public int dividir() {
		return this.a / this.b;
	}
}
