import compra.computadores.modelo.Cliente;
import compra.computadores.modelo.Computador;
import compra.computadores.modelo.MemoriaUSB;
import compra.computadores.uteis.ProcessarPedido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente("Samuel", "12345678900");

        Computador promocao1 = new Computador("Apple", 9850);
        Computador promocao2 = new Computador("Samsung", 11084);
        Computador promocao3 = new Computador("Dell", 15528);

        MemoriaUSB memoria1 = new MemoriaUSB("Pendrive", 16);
        MemoriaUSB memoria2 = new MemoriaUSB("Pendrive", 32);
        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 1000);


        promocao1.setSistema("macOS Sequoia", 64);
        promocao2.setSistema("Windows 8", 64);
        promocao3.setSistema("Windows 10", 64);


        promocao1.addHardware("Pentium Core i3", 2200);
        promocao1.addHardware("Memória RAM", 8);
        promocao1.addHardware("HD", 500);

        promocao2.addHardware("Pentium Core i5", 2200);
        promocao2.addHardware("Memória RAM", 16);
        promocao2.addHardware("HD", 1000);

        promocao3.addHardware("Pentium Core i7", 2200);
        promocao3.addHardware("Memória RAM", 32);
        promocao3.addHardware("HD", 2000);

        promocao1.addMemoriaUSB(memoria1);
        promocao2.addMemoriaUSB(memoria2);
        promocao3.addMemoriaUSB(memoria3);

        System.out.println("Mostrando Configurações do Computador 1");

        promocao1.mostraPCConfigs();

        System.out.println();

        System.out.println("Mostrando Configurações do Computador 2");

        promocao2.mostraPCConfigs();

        System.out.println();

        System.out.println("Mostrando Configurações do Computador 3");

        promocao3.mostraPCConfigs();

        System.out.println("Quais Computadores deseja Comprar?");
        System.out.println("Digite 1, para o primeiro, 2 para o Segundo e 3 para o terceiro. Quando não quiser comprar mais nenhum, digite 0");


        while(true)
        {

            System.out.println("adicione ao carrinho");
            int opcao = entrada.nextInt();

            if (opcao == 0)
            {
                break;
            }

            else if(opcao == 1)
                {
                    cliente.addPc(promocao1);

                    System.out.println("Computador 1 adicionado com sucesso");
                }
            else if(opcao == 2)
            {
                cliente.addPc(promocao2);
                System.out.println("Computador 2 adicionado com sucesso");
            }
            else if(opcao == 3)
            {
                cliente.addPc(promocao3);
                System.out.println("Computador 3 adicionado com sucesso");
            }
            else {
                System.out.println("opcao invalida, tente novamente");
            }


        }

        ProcessarPedido.processar(cliente.getComputadores());

        System.out.println("Informações da Compra:" + " ");

        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("CPF do Cliente: " + cliente.getCpf());

        System.out.println(" ");

        System.out.println("Computadores Adquiridos:");
        cliente.mostraCompra();

        System.out.println("Valor total da compra = R$" + cliente.calculaTotalCompra());




    }
}
