package basicJava;

import java.util.Scanner;

public class Temperature_converter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //celsiusToFahrenheitAndKelvin();
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                double kelvin = celsius + 273.15;
                System.out.println("Temperature in Fahrenheit: ");
                System.out.printf("%.2f °F\n",fahrenheit);
                System.out.println("Temperature in Kelvin: ");
                System.out.printf("%.2f K",kelvin);
                break;
            case 2:
                //fahrenheitToCelsiusAndKelvin();
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit1 = scanner.nextDouble();

                double celsius1 = (fahrenheit1 - 32) * 5/9;
                double kelvin1 = (fahrenheit1 + 459.67) * 5/9;

                System.out.println("Temperature in Celsius: ");
                System.out.printf("%.2f °C\n",celsius1);
                System.out.println("Temperature in Kelvin: ");
                System.out.printf("%.2f K",kelvin1);
                break;
            case 3:
                //kelvinToCelsiusAndFahrenheit();
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin2 = scanner.nextDouble();

                double celsius2 = kelvin2 - 273.15;
                double fahrenheit2 = (kelvin2 * 9/5) - 459.67;

                System.out.println("Temperature in Celsius: ");
                System.out.printf("%.2f °C\n",celsius2);
                System.out.println("Temperature in Fahrenheit: ");
                System.out.printf("%.2f °F",fahrenheit2);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        scanner.close();
    }

    /* private static void celsiusToFahrenheitAndKelvin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    private static void fahrenheitToCelsiusAndKelvin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit + 459.67) * 5/9;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    private static void kelvinToCelsiusAndFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();

        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 9/5) - 459.67;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    } */
}
