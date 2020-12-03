package OrientacaoObjeto;

import java.util.Scanner;

public class usarLampada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Lampada encandecente = new Lampada();
		encandecente.mostraEstado();
		
		
		Lampada fluorescente = new Lampada();
		fluorescente.apaga();
		
		encandecente.apaga();
		encandecente.mostraEstado();

	}

}
