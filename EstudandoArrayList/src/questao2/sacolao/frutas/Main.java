package questao2.sacolao.frutas;

public class Main {
    public static void main(String[] args) {
        Fruta uva = new Fruta();
        uva.nome = "Uva";
        uva.preco = 4.50;

        Fruta melancia = new Fruta();
        melancia.nome = "Melancia";
        melancia.preco = 8.20;

        Fruta banana = new Fruta();
        banana.nome = "Banana";
        banana.preco = 5.80;

        Sacolao sc = new Sacolao();
        sc.adicionaFrutas(uva);
        sc.adicionaFrutas(melancia);
        sc.adicionaFrutas(banana);
        System.out.println("A quantidade de frutas no sacolão é: " + sc.getQuantidadeFrutas());
        System.out.println("Total da compra: " + sc.calcularPreco());
    }
}
