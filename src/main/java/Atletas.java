import java.util.Locale;
import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, count_mulheres=0;
        String nome="", nome_alto="", sexo;
        double altura, maior_altura=0.0, peso, peso_medio=0.0, soma_altura=0.0, soma_peso=0.0, altura_media=0.0, porcentagem=0.0;

        System.out.print("Qual a quantidade de atletas? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite os dados do atleta numero %d: \n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Sexo: ");
            sexo = sc.next().toUpperCase();
            while(!sexo.equals("F") && !sexo.equals("M")) {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().toUpperCase();
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            while(altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }
            System.out.print("Peso: ");
            peso = sc.nextDouble();
            while(peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            if(sexo.equals("F")) {
                count_mulheres++;
                soma_altura += altura;
            }

            soma_peso += peso;

            if(altura > maior_altura){
                maior_altura = altura;
                nome_alto = nome;
            }
        }

        peso_medio = soma_peso / n;
        porcentagem = (double) ((n - count_mulheres)*100) / n;

        System.out.println();
        System.out.println("RELATÓRIO: ");
        System.out.printf("Peso médio dos atletas: %.2f\n", peso_medio);
        System.out.println("Atleta mais alto: " + nome_alto);
        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagem);

        if(count_mulheres > 0) {
            altura_media = soma_altura / count_mulheres;
            System.out.printf("Altura média das mulheres: %.2f\n", altura_media);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}
