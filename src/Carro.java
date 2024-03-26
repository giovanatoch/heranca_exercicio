class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas, String cor, int ano) {
        super(marca, modelo, cor, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void getNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
