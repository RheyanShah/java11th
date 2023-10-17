import java.util.Scanner;

public class w9q3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Options:");
        System.out.println("a) Temperature provided in Celsius");
        System.out.println("b) Temperature provided in Kelvin");
        System.out.println("c) Temperature provided in Fahrenheit");
        System.out.print("Enter your choice (a/b/c): ");
        char choice = sc.next().charAt(0);
        double temperature;
        System.out.print("Enter the temperature: ");
        temperature = sc.nextDouble();
        double convertedTemperature1, convertedTemperature2;
        if (choice == 'a') 
        {
            convertedTemperature1 = (9.0 / 5.0) * temperature + 32.0;
            convertedTemperature2 = temperature + 273.0;
        } 
        else if (choice == 'b') 
        {
            convertedTemperature1 = temperature - 273.0;
            convertedTemperature2 = (9.0 / 5.0) * (temperature - 273.0) + 32.0;
        } 
        else if (choice == 'c') 
        {
            convertedTemperature1 = (5.0 / 9.0) * (temperature - 32.0);
            convertedTemperature2 = (5.0 / 9.0) * (temperature - 32.0) + 273.0;
        } 
        else 
        {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        System.out.println("Equivalent Temperatures:");
        System.out.println("1: " + convertedTemperature1);
        System.out.println("2: " + convertedTemperature2);
        sc.close();
    }
}
