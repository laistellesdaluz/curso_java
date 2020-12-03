package OrientacaoObjeto;

import java.util.Scanner;

public class usarCelular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Celular iphone = new Celular();
		iphone.baterFoto();
		iphone.desligar();
		
		Celular android = new Celular();
		android.ligar();
		android.radio();
	}

}
