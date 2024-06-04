package sistemaOperacional.navegadorInternet;

public class InternetExplorer implements NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionada nova pagina");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");

	}

}
