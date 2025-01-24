package Iphone;

public class aparelhoTelefonico extends modeloCelular{
	private String numero;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void Ligar(String numero) {
		System.out.println("Chamando...");
	}
	public void atender() {
		System.out.println("Recebendo chamada...");
	}
	public void iniciarCorrerioDeVoz() {
		System.out.println("Chamada em andamento...");
	}
	

}
