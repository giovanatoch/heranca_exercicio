class Veiculo {
    private String marca, modelo, cor;

    private int ano;

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    //getMarca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
         this.marca = marca;
    }

    //getModelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //getCor
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    //getAno
    public int getAno() {
        return ano;
    }
    public void getAno(int ano) {
        this.ano = ano;
    }
}