package questao1.agencia.carros;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";
        c1.preco = 12000;

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preto";
        c2.preco = 30000;

        Carro c3 = new Carro();
        c3.nome = "C3";
        c3.cor = "Azul";
        c3.preco = 68000;

        Agencia ag = new Agencia();
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);
        ag.adicionarCarro(c3);
        System.out.println("A agência possui " + ag.getQuantidadecarros() + " carros");
        System.out.println("O valor total dos carros é:" + ag.calculaPreco());
    }
}
