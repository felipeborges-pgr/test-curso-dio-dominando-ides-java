package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*int a = 2;
		int b = 3;
		int soma = a + b;
		
		System.out.println("Hello World!" + "\n" + soma);
		*/
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
	}

}

class Livros {
	private String nome;
}
