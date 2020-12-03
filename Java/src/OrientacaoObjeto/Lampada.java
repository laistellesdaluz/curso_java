package OrientacaoObjeto;

public class Lampada {
	String estadoDaLampada;
	
	public void acende(){
		estadoDaLampada= "aceso";
	}
	public void apaga() {
		estadoDaLampada = "apagado";
	}
	public void mostraEstado() {
		System.out.println(estadoDaLampada);
	}
}
