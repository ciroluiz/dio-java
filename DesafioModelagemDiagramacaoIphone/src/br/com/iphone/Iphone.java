package br.com.iphone;

import br.com.interfaces.AparelhoTelefonico;
import br.com.interfaces.NavegadorInternet;
import br.com.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();

		iphone.ligar("+5511988776655");
		iphone.atender();
		iphone.iniciarCorreioVoz();

		iphone.exibirPagina("www.java.com");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();

		iphone.selecionarMusica("Águas de março");
		iphone.tocar();
		iphone.pausar();
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando o site " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo uma aba nova no navegador...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página atual...");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando uma música...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música " + musica);
	}

}
