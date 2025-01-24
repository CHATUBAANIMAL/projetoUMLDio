package Iphone;

public class Iphone extends modeloCelular{
		private reprodutorMusical player;
		private aparelhoTelefonico telefone;
		
		public Iphone () {
			this.telefone = new aparelhoTelefonico();
			this.player = new reprodutorMusical();
		
	}
	public void Ligar () {
		telefone.Ligar("123123");
	}
	public void Atender () {
		telefone.atender();
	}
	public void iniciarCorreioDeVoz() {
		telefone.iniciarCorrerioDeVoz();
	}
	
	public void selecionarMusica () {
		player.selecionarMusica("musica favorita");
	}
	public void Tocar() {
		player.Tocar();
	}
	public void Pausar () {
		player.Pausar();
	}
}


