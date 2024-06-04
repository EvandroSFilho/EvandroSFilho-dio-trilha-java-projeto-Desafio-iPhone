package sistemaOperacional.aparelhoTelefonico;

public class UnboxingLG implements AparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando: " + numero);

	}

	@Override
	public void atender() {
		System.out.println("Atender");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");

	}

}
