public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			String mensagem = e.getMessage();
			System.out.println("Exception: " + mensagem);
			e.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			// Abaixo esta o gatilho da exception: ArithmeticException
			int a = i / 0;

			// Abaixo esta o gatilho da exception: NullPointerException
			// Conta conta = null;
			// conta.deposita();
		}
		System.out.println("Fim do metodo2");
	}
}