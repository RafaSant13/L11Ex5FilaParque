package view;

import controller.ParqueControle;
import model.Fila;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<>();
		ParqueControle pc = new ParqueControle();
		
		for (int i = 1; i<=30;i++) {
			String nome = "Pessoa"+i;
			int idade = (int)((Math.random()*31)+10);
			float altura = (float)((Math.random()*0.65)+1.35);
			Pessoa p = new Pessoa(nome, idade, altura);
			fila.insert(p);
		}
		pc.Brinquedo(fila);
		

	}

}
