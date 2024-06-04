package sistemaOperacional.aparelho;

import sistemaOperacional.aparelhoTelefonico.AparelhoTelefonico;
import sistemaOperacional.navegadorInternet.NavegadorInternet;
import sistemaOperacional.reprodutorMusical.ReprodutorMusical;

public class Sistema implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	public void tocar() {
		System.out.println("Reproduzindo musica via equipamento Iphone");

	}

	public void pausar() {
		System.out.println("Parado na musica via equipamento Iphone");

	}

	public void selecionarMusica(String musica) {
		System.out.println("Escolhendo musica " + musica + " via equipamento Iphone" );

	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina " + url  + " via equipamento Iphone");

	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova pagina via equipamento Iphone");

	}

	public void atualizarPagina() {
		System.out.println("Atualizando a pagina via equipamento Iphone");
	}

	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " via equipamento Iphone");

	}

	public void atender() {
		System.out.println("Atender via equipamento Iphone");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz via equipamento Iphone");

	}

}
