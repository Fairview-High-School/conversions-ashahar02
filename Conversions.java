import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose one of the options:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Feet to Meters");
            System.out.println("4. Meters to Feet");
            System.out.println("5. Ounces to Milliliters");
            System.out.println("6. Milliliters to Ounces");
            System.out.println("7. Centimeters to Meters");
            System.out.println("8. Meters to Centimeters");
            System.out.println("9. Litters to Milliliters");
            System.out.println("10. Milliliters to Litters");
        int selection = keyboard.nextInt();
        keyboard.nextLine();
        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
           
        }
        //add more if statements here.
    }
}