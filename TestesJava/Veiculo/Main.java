package Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Up","Volkswagen",100);
        veiculo1.Maxima(70);
        System.out.println("Velocidade máxima: " + veiculo1.velocidademax + ", Velocidade atual: " + veiculo1.velocidadeatual);
        veiculo1.Maxima(120);
        System.out.println("Velocidade máxima: " + veiculo1.velocidademax + ", Velocidade atual: " + veiculo1.velocidadeatual);

    }
}
