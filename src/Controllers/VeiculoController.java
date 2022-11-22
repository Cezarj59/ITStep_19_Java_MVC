package Controllers;

import Models.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoController {

    public static ArrayList<Veiculo> getByCor(ArrayList<Veiculo> lista, String cor) {
        ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

        for (Veiculo p : lista) {
            if (p.getCor().toLowerCase().equals(cor.toLowerCase())) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public static Veiculo cadastra() {
        Veiculo p = new Veiculo();
        Scanner read = new Scanner(System.in);

        System.out.print("Modelo: ");
        p.setModelo(read.nextLine());

        System.out.print("Ano: ");
        p.setAno(read.nextLine());

        System.out.print("Cor: ");
        p.setCor(read.nextLine());

        return p;
    }
}
