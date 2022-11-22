package Main;

import Models.Veiculo;
import Views.VeiculoView;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        VeiculoView.cadastra(veiculos);
        VeiculoView.printByCor(veiculos);
    }

}
