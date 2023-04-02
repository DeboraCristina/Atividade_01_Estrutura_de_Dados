package view;

import controller.FatorialControler;

import java.util.Scanner;

public class Main
{
    public static void menu (FatorialControler controller)
    {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        System.out.println("Menu Principal");

        do
        {
            System.out.println("Digite um valor\nou \"sair\" para encerrar");
            System.out.print(": ");
            entrada = scanner.nextLine();
            try
            {
                int num = Integer.parseInt(entrada);
                controller.fatorial(num);
                if (num < 0 || num > 10)
                    System.out.println("Não permitido");
                else
                    System.out.println(controller.fatorial(num));
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
        FatorialControler fat = new FatorialControler();
        menu(fat);
    }
}