package org.juanpla.contabanco;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ContaTerminal {
	public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("#.00");
		df.setParseBigDecimal(true);
        try (Scanner scanner = new Scanner(System.in)) {
			scanner.useDelimiter(System.getProperty("line.separator")); 
			int continuar = 1;
			int errosPreenchimento = 0;			
			while (continuar == 1) {				
			    System.out.print("Digite o número da conta: ");			    
				int conta = 0;			    
				try {
					conta = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("Erro: Use somente números.");
					scanner.nextLine();
					errosPreenchimento++;
				}

				System.out.print("Digite o número da agência: ");
				String agencia = "";
				try {
					if (scanner.hasNext()){
						agencia = scanner.next();
					}
					if (agencia.indexOf("-") == -1){
						throw new Exception("Formato da agência está incorreto");
					} 

				} catch (Exception e) {
					System.out.println("Erro: Digite corretamente o número da agência. Use o hífen e informe o dígito da agencia.");					
					scanner.nextLine();
					errosPreenchimento++;
				}
				
				System.out.print("Digite o nome do cliente: ");
				String nomeCliente = "";
				try {					
					if(scanner.hasNext()){
						nomeCliente = scanner.next();
					}				
					
					if (nomeCliente.indexOf(" ") == -1){
						throw new Exception("Erro: Insira nome e sobrenome");
					}
				} catch (Exception e) {
					System.out.println("Erro: Digite corretamente o nome do cliente. Use nome e sobrenome.");
					scanner.nextLine();
					errosPreenchimento++;
				}
				
				System.out.print("Digite o saldo: ");
				String input = "";
				Number saldo = null;
				
				try {
					if (scanner.hasNext()){
						input = scanner.next();
					}
					if (input.indexOf(".") == -1){
						input += ".0";
					}

			        saldo = df.parse(input);			        
			    } catch (ParseException e) {
			        System.out.println("Erro: Você não digitou um número válido.");
					errosPreenchimento++;
			    }
				String msg = "";

				if (errosPreenchimento > 0){
					msg = "Houve " + errosPreenchimento + " erros de preenchimento. Por favor tente novamente.";
				} else {
					msg = "Olá " + nomeCliente + 
					", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
					", conta " + conta + 
					" e seu saldo " + df.format(saldo) + " já está disponível para saque." ;
				}
				
				System.out.println(msg);

			    System.out.print("Deseja continuar? (1 para sim, 9 para não): ");
			    continuar = scanner.nextInt();
			    scanner.nextLine();
				errosPreenchimento = 0;

			    if (continuar == 9) {					
			        System.out.println("Programa encerrado.");
			        break;
			    }
			}
		}
    }
}

