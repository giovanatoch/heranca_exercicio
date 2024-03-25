class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas, String cor, int ano) {
        super(marca, modelo, cor, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
