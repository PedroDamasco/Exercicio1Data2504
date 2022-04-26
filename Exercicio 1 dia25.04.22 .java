package Lista3;
import java.util.Scanner;
public class Aula2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ac1 = 0 a 1,5 | ac2 = 0 a 3 | ag = 0 a 1 | Af = 0 a 4,5 <- Notas a serem imputadas
		
		
		Scanner nota =new Scanner(System.in); // Scanner de recebimento de dados
		
		double ac1,ac2,ag,af,resu; // Dados a serem adquiridos 
		
		System.out.print("Boa noite, iremos calcular a media do aluno"); // Expondo pedido
		//
		System.out.print("\nInsira a nota da AC1 ( Valores de 0 a 1,5):"); // Recebendo primeiro dado
		ac1 = nota.nextDouble(); // concedendo valor ao primeiro agente
		
		
		System.out.print("\nInsira a nota da AC2 ( Valores de 0 a 3):"); // Recebendo segundo dado
		ac2 = nota.nextDouble(); // Concedendo valor ao segundo agente
		
		
		System.out.print("\nInsira a nota da AG ( Valores de 0 a 1):"); // Recebendo terceiro dado
		ag = nota.nextDouble(); //Concedendo valor ao terceiro agente 
		
		
		System.out.print("\nInsira a nota Avaliacao Final ( Valores de 0 a 4,5):"); // Recebendo quarto dado
		af = nota.nextDouble(); // Concedendo valor ao quarto agente
		
		resu= ac1+ac2+ag+af; // Efetuando o calculo 
		
		System.out.print("\nA nota final do aluno é: "+resu); // Expondor media final do aluno
		
		// Informar se o aluno foi Aprovado ou Reprovado
		
		if ( resu >= 5) 
			System.out.print("\nAluno Aprovado");
		else 
			System.out.print("\nAluno Reprovado");
		
		
		
		
	}

}
