import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            double numberOne = 0;
            double numberTwo = 0;

            try {
                System.out.println("Digite o primeiro número");
                numberOne = scanner.nextInt();
                System.out.println("Digite o segundo número");
                numberTwo = scanner.nextInt();

                Calculator calculator = new Calculator(numberOne, numberTwo);
    
                System.out.println("Qual operação deseja efetuar?");
                System.out.println("1 - Soma");
                System.out.println("2 - Substração");
                System.out.println("3 - Divisão");
                System.out.println("4 - Multiplicação");
    
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println(calculator.Sum());
                        break;
                    case 2:
                        System.out.println(calculator.Subtract());
                        break;
                    case 3:
                        System.out.println(calculator.Divide());
                        break;
                    case 4:
                        System.out.println(calculator.Multiple());
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Um erro ocorreu, mensagem: " + e.getMessage());
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}