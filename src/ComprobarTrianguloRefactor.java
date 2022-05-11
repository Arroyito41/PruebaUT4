
public class ComprobarTrianguloRefactor {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 4;

		comprobarTriangulo(a, b, c);
	}

	public static String comprobarTriangulo(int a, int b, int c) {
		if ((a == b) && (a == c)) {
			String mensaje = "equilatero";
			System.out.println(mensaje);
		} else if ((a == b) || (a == c) || (b == c)) {
			System.out.println("isosceles");
		} else {
			System.out.println("escaleno");
		}
		return null;
	}
}
