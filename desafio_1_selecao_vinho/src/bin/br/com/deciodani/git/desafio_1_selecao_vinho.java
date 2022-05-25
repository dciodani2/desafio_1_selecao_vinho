package bin.br.com.deciodani.git;
import java.util.Scanner;

public class desafio_1_selecao_vinho {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de vinho: ");
        String T = scan.nextLine();

        System.out.println("Digite a resposta dos competidores: ");
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        
        int count = 0;
        for (String resposta : respostasCompetidoresSplit) {
        	System.out.print(resposta);
            if (resposta.equals(T)) {
                count++;
            }
        }
        System.out.print("O número de respostas corretas é: ");
        System.out.print(count);

	}

}
