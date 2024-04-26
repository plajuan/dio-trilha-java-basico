import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ContaTerminal {
    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("#.00");
		df.setParseBigDecimal(true);
        try (Scanner scanner = new Scanner(System.in)) {		
			int continuar = 1;
			while (continuar == 1) {
			    System.out.print("Digite um número decimal: ");
			    String input = scanner.nextLine();

			    try {
			        Number numero = df.parse(input);
			        System.out.println("O número digitado é {" + df.format(numero) + "}");
			    } catch (ParseException e) {
			        System.out.println("Erro: Você não digitou um número válido.");
			    }

			    System.out.print("Deseja continuar? (1 para sim, 9 para não): ");
			    continuar = scanner.nextInt();
			    scanner.nextLine();

			    if (continuar == 9) {
			        System.out.println("Programa encerrado.");
			        break;
			    }
			}
		}
    }
}

