package Funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumento(double percentual) {
        if (percentual > 0) {
            double aumento = salario * (percentual / 100);
            salario += aumento;
            System.out.printf("Salário aumentado em %.2f%% (+R$%.2f). Novo salário: R$%.2f%n", 
                             percentual, aumento, salario);
        } else {
            System.out.println("Erro: O percentual de aumento deve ser positivo.");
        }
    }
}
