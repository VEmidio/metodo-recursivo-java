package calculosalarial;

import java.util.Scanner;

public class CalculoSalarial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double hrTraMes;
        double vlrSalarioMes;
        
        System.out.println("Digite o número de horas trabalhadas em um mês:");
        hrTraMes = input.nextDouble();
        
        System.out.println("Digite o valor do salário minimo: ");
        vlrSalarioMes = input.nextDouble();
        
        double valorHr = vlrSalarioMes * 0.1;
        
        double salarioBruto = valorHr * hrTraMes;
        
        double imposto = salarioBruto * 0.03;
        double salarioLi = salarioBruto - imposto; 
        System.out.println("Salário a receber: " + salarioLi);
        
        
    }
    
}
