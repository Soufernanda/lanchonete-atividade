import java.sql.SQLOutput;
import java.util.Scanner;

public class Lanchonete {
        private Scanner input= new Scanner(System.in);
    public int MostrarMenu(){
        System.out.println("=== Opções ===");
        System.out.println("1- Ver Cardápio");
        System.out.println("2- Fazer Pedido");
        System.out.println("3- Sair");
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    public void MostrarCardapio(){
        System.out.println("\n Cardápio");
        System.out.println("1- X-Salada");
        System.out.println("2- X-Bacon");
        System.out.println("3- X-Egg");
    }

    public void fazerPedido(){
        System.out.println("Digite o número do item");
        int item= input.nextInt();
        input.nextLine();
        switch (item){
            case 1:
                System.out.println("X-Salada");
                break;
            case 2:
                System.out.println("X-Bacon");
                break;
            case 3:
                System.out.println("X-Egg");
                break;
            default:
                System.out.println("Item invalido");
        }
    }

}

