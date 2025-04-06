public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Up","Volkswagen",100);
        veiculo1.Maxima(100);
        System.out.println("Velocidade máxima: " + veiculo1.getvelocidademax() + ", Velocidade atual: " + veiculo1.getvelocidadeatual());
        veiculo1.Maxima(101);
        System.out.println("Velocidade máxima: " + veiculo1.getvelocidademax() + ", Velocidade atual: " + veiculo1.getvelocidadeatual());

    }
}
