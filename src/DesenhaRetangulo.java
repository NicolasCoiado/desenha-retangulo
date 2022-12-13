import java.util.Scanner;
public class DesenhaRetangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas (máx 20 linhas): ");
        int l = sc.nextInt();
        System.out.print("Digite o número de colunas (máx 20 colunas): ");
        int c = sc.nextInt();
        desenhar(l, c);
        sc.close();
    }
    public static void desenhar(int linha, int coluna) {
        if ((linha < 1)) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        } else if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }
        System.out.print("+");
        for (int i = 0; i < linha; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int i = 0; i < coluna; i++) {
            System.out.print("|");
            for (int j = 0; j < linha; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("+");
        for (int i = 0; i < linha; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
