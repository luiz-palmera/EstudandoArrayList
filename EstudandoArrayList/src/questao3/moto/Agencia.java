package questao3.moto;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    String nome;

    List<Moto> listaDeMotos = new ArrayList<Moto>();

    public void adicionaMoto(Moto moto){
        listaDeMotos.add(moto);
    }

    public int getQuantidadeMoto(){
        return listaDeMotos.size();
    }

    public double calculaValor(){
        double somaMotos = 0.0;

        for(int i = 0; i <listaDeMotos.size(); i++){
            Moto m = (Moto)listaDeMotos.get(i);
            somaMotos += m.valor;
        }
        return somaMotos;
    }
}
