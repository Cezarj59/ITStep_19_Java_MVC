package Views;

import Controllers.VeiculoController;
import Models.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoView {

    public static void cadastra(ArrayList<Veiculo> lista) {
        Scanner read = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("===CADASTRO DE VEICULO===");
        System.out.println("========================");
        lista.add(VeiculoController.cadastra());
        System.out.println("VEICULO CADASTRADO!");
    }

    public static void printByCor(ArrayList<Veiculo> lista) {
        Scanner read = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("===CONSULTA DE VEICULO===");
        System.out.println("========================");
        System.out.print("Qual a cor:");
        String cor = read.nextLine();

      
        System.out.println("Veiculos da cor " + cor);
        for (Veiculo p : VeiculoController.getByCor(lista, cor)) {
            System.out.println("Modelo: " + p.getModelo());
            System.out.println("Ano: " + p.getAno());
        }
    }
}
