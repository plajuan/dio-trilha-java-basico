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
			    System.out.print("Digite um n�mero decimal: ");
			    String input = scanner.nextLine();

			    try {
			        Number numero = df.parse(input);
			        System.out.println("O n�mero digitado � {" + df.format(numero) + "}");
			    } catch (ParseException e) {
			        System.out.println("Erro: Voc� n�o digitou um n�mero v�lido.");
			    }

			    System.out.print("Deseja continuar? (1 para sim, 9 para n�o): ");
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

