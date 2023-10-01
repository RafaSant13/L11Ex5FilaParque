package controller;

import model.Fila;
import model.Pessoa;

public class ParqueControle {

	public ParqueControle() {
		super();
	}
	
	public void Brinquedo(Fila<Pessoa> fila) {
		while(!fila.isEmpty()) {
			try {
				Pessoa p = fila.remove();
				if (p.idade>=16 && p.altura>=1.6) {
					System.out.println(p.nome+" passou para o brinquedo");
				}
				else if (p.idade<16 && p.altura<1.6) {
					System.out.printf(p.nome+" não passou para o brinquedo pois sua idade (%d) é menor que 16 e sua altura (%.2f) é menor que 1,60m%n", p.idade, p.altura);
				}
				else if (p.idade<16) {
					System.out.println(p.nome+" passou para o brinquedo pois sua idade ("+p.idade+") é menor que 16");
				}
				else if (p.altura<1.6) {
					System.out.printf(p.nome+" não passou para o brinquedo pois sua altura (%.2f) é menor que 1,60m%n", p.altura);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

}
