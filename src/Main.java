import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete();
        int opcao;

        do {
            opcao = lanchonete.MostrarMenu();
            switch (opcao) {
                case 1:
                    lanchonete.MostrarCardapio();
                    break;
                case 2:
                    lanchonete.fazerPedido();
                    break;
                case 3:
                    System.out.println("Pedido confirmado, aguarde entrega!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();
        } while (opcao != 3);
    }
}
