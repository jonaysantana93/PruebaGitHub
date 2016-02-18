public class Palindroma {

	private String cadena;

	public Palindroma(String c) {
		this.cadena = c;
	}

	public String palin() {
		String vuelta = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			vuelta = vuelta + cadena.charAt(i);
		}
		return cadena + vuelta;
	}
}
