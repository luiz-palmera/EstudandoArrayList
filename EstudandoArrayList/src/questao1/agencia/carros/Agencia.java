package questao1.agencia.carros;
import java.util.List;
import java.util.ArrayList;

public class Agencia {
    String nome;
    //Criando uma lista de carros do tipo Carro
    //um array list de carros.
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();


    //criando um metodo sem retorno, para inculir tipos de Carro
    //dentro da lista de carros.
    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }

    //utilizando a propriedade size da classe arraylist para contar
    //a quantidade de carros da Lista.
    public int getQuantidadecarros(){
        return listaCarros.size();
    }

    public double calculaPreco(){
        double somaValor = 0.0;

        for(int i = 0; i < listaCarros.size(); i++){
            Carro c = (Carro)listaCarros.get(i);
            somaValor += c.preco;
        }

        return somaValor;

    }

}




