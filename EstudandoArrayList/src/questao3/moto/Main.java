package questao3.moto;

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.nome = "CG";
        m1.cor = "Vermelha";
        m1.valor = 8000;

        Moto m2 = new Moto();
        m2.nome = "Tyger";
        m2.cor = "Cinza";
        m2.valor = 15000;

        Agencia ag = new Agencia();
        ag.adicionaMoto(m1);
        ag.adicionaMoto(m2);

        System.out.println("A quantidade de motos é: " + ag.getQuantidadeMoto());
        System.out.println("O valor total das motos é: " + ag.calculaValor());
    }
}
