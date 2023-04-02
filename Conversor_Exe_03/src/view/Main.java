package view;


import controller.ConversorController;

import java.util.Scanner;

public class Main
{
    public static void menu (ConversorController controller)
    {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        System.out.println("Menu Principal");

        do
        {
            System.out.println("Digite um valor para conversão\nou \"sair\" para encerrar");
            System.out.print(": ");
            entrada = scanner.nextLine();
            try
            {
                int num = Integer.parseInt(entrada);
                controller.dec2Bin(num);
                if (num > 1000)
                    System.out.println("Não permitido");
                else
                    System.out.println(controller.dec2Bin(num));
            }
            catch (Exception e)
            {
                if (!entrada.equals("sair"))
                    System.out.println("Opção inválida");
            }
        } while (!entrada.equals("sair"));
        System.out.println("Fim do programa");
    }
    public static void main(String[] args)
    {
        ConversorController controller = new ConversorController();

        menu(controller);
    }
}
