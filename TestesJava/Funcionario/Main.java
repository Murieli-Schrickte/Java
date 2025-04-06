package Funcionario;

public class Main {
    public static void main(String[] args) {
       
        Funcionario funcionario1 = new Funcionario("João Silva", "Desenvolvedor", 5000.0);
        
        System.out.println("\n--- Aumento de 10% ---");
        funcionario1.aumento(10.0);
        
        System.out.println("\n--- Tentativa de aumento inválido ---");
        funcionario1.aumento(-5.0);
        
        System.out.println("\n--- Aumento de 20% ---");
        funcionario1.aumento(20.0);
    }
}
