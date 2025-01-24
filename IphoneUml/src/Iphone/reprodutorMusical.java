package Iphone;

public class reprodutorMusical extends modeloCelular{
	private String musica;

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String selecionarMusica(String musica) {
		Tocar();
		System.out.println("tocando " + musica);
		return musica;
	}

	public void Tocar() {

		System.out.println("Tocando múscia...");
	}

	public void Pausar() {
		System.out.println("Música pausada");
	}

}
