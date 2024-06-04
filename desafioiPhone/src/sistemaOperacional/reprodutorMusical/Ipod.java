package sistemaOperacional.reprodutorMusical;

public class Ipod implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");

	}

	@Override
	public void pausar() {
		System.out.println("Pause");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica: " + musica);

	}

}