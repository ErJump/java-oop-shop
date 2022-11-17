package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva = 20;
	
	Prodotto(String nome, String descrizione, int prezzo) {
        Random rnd = new Random();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.codice = rnd.nextInt(10000, 100000);
	}

    public int getPrice() {
        return prezzo;
    }

    public int getPriceIVA() {
        return prezzo + (prezzo * iva / 100);
    }
    
    @Override
    public String toString() {
    	return "Nome: " + nome + "\nDescrizione: " + descrizione + "\nCodice: " + codice + "\nPrezzo: " + prezzo ;
    }
    
}
