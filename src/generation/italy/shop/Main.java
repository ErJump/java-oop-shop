package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto pr1 = new Prodotto("IPhone 12", "telefono scadente, il peggiore di sempre", 1000 );
		System.out.println(pr1.toString());
		int pr1Price = pr1.getPrice(); 
		int pr1PriceIVA = pr1.getPriceIVA();
		System.out.println("Prezzo: " + pr1Price + "$ \nPrezzo con IVA: " + pr1PriceIVA + "$");
		
		Prodotto pr2 = new Prodotto("Mappamondo", "Viaggia dove vuoi con la tua mente, punta il dito e vai!", 20);
		System.out.println("---------------");
		System.out.println(pr2.toString());
		int pr2Price = pr2.getPrice(); 
		int pr2PriceIVA = pr2.getPriceIVA();
		System.out.println("Prezzo: " + pr2Price + "$ \nPrezzo con IVA: " + pr2PriceIVA + "$");
		
	}
}
