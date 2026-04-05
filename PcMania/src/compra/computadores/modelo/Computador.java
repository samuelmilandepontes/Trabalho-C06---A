package compra.computadores.modelo;

public class Computador {

    private String marca;
    private float preco;

    private HardwareBasico[] hardwares;
    private SistemaOperacional sistema;
    private MemoriaUSB usb;
    private int contador = 0;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        hardwares = new HardwareBasico[3];
    }



    public void addHardware(String nome, float capacidade) {
        if (contador < hardwares.length) {
            hardwares[contador] = new HardwareBasico(nome, capacidade);
            contador++;
        }
    }

    public void setSistema(String nome, int tipo) {
        this.sistema = new SistemaOperacional(nome, tipo);
    }


    public void addMemoriaUSB(MemoriaUSB memoriaUSB)
    {
        this.usb = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }


    public void mostraPCConfigs() {

            System.out.println("Marca: " + marca);
            System.out.println("Preço: R$" + preco);

            System.out.println("Hardware:");
            for (int i = 0; i < hardwares.length; i++) {

                System.out.print("- " + hardwares[i].getNome() + " ");

                if(i==0)
                System.out.println(" " + hardwares[i].getCapacidade() + " Mhz");

                else
                    System.out.println(" " + hardwares[i].getCapacidade() + " Gb");

            }

                System.out.println("Sistema: " + sistema.getNome() + " " + sistema.getTipo() + " bits");


                System.out.println("USB: " + usb.getNome() + " " + usb.getCapacidade() + " GB");
        }



    }