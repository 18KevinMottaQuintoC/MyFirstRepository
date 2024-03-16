import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: división por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }

        scanner.close();
    }
}
