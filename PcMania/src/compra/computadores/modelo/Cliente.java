package compra.computadores.modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador computadores[];

    private int contador = 0;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        computadores = new Computador[10];
    }

    public void addPc(Computador computador) {
        if(contador < computadores.length) {
            computadores[contador] = computador;
            contador++;
        }
    }


    public float calculaTotalCompra() {

        float soma = 0;

        for (int i = 0; i < contador; i++) {
            soma += computadores[i].getPreco();
        }

        return soma;
    }

    public void mostraCompra() {
        for (int i = 0; i < contador; i++) {
            computadores[i].mostraPCConfigs();

            System.out.println(" ");
        }
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public String getNome() {
        return nome;

    }

    public String getCpf() {
        return cpf;
    }


}