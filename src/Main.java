//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Pulse", 4, "Prata", 2022);
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Número de Portas: " + carro.getNumeroPortas());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano: " + carro.getAno());

        System.out.println("=========================================");

        Moto moto = new Moto("BMW", "Motorrad", 500, "Vermelho", 2022);
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Ano: " + moto.getAno());
    }
}