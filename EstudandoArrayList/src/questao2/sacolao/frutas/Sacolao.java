package questao2.sacolao.frutas;
import java.util.ArrayList;
import java.util.List;

public class Sacolao {
    String nome;

    List<Fruta> frutas = new ArrayList<Fruta>();

    public void adicionaFrutas(Fruta fruta){
        frutas.add(fruta);
    }

    public int getQuantidadeFrutas(){
        return frutas.size();
    }

    public double calcularPreco(){
        double somaValor = 0.0;

        for (int i  = 0; i< frutas.size(); i++){
            Fruta f = (Fruta)frutas.get(i);
            somaValor += f.preco;
        }

        return somaValor;
    }
}
