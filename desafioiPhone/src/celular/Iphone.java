package celular;

import sistemaOperacional.aparelho.Sistema;
import sistemaOperacional.aparelhoTelefonico.AparelhoTelefonico;
import sistemaOperacional.navegadorInternet.NavegadorInternet;
import sistemaOperacional.reprodutorMusical.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		Sistema sis = new Sistema();

		ReprodutorMusical reprodutorMusical = sis;
		NavegadorInternet navegadorInternet = sis;
		AparelhoTelefonico aparelhoTelefonico = sis;

		System.out.println("Musica");
		reprodutorMusical.selecionarMusica("Pop");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		System.out.println("-----------------------------------");

		System.out.println("Internet");
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.exibirPagina("https://");
		navegadorInternet.atualizarPagina();
		System.out.println("-----------------------------------");

		System.out.println("Telefone");
		aparelhoTelefonico.ligar("12345-6789");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();
		System.out.println("-----------------------------------");
	}
}
