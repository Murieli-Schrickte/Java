package Veiculo;

public class Veiculo {
   private String modelo;
   private String marca;
   private int velocidademax;
   private int velocidadeatual;

public Veiculo(String modelo, String marca, int velocidademax){
    this.modelo = modelo;
    this.marca = marca;
    this.velocidademax = velocidademax;
}
public String getmodelo(){
    return modelo;
}
public String getmarca(){
    return marca;
}
public int getvelocidademax(){
    return velocidademax;
}

public void Maxima(int velocidade){
    if (velocidade < velocidademax){
        System.out.println("Velocidade atual: " + velocidade);
        velocidadeatual = velocidade;
    }
    else{
        System.out.println("Erro: Velocidade máxima ultrapassada");
    }
} 
public int getvelocidadeatual(){
    return velocidadeatual;
}
}
