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
        System.out.println("Choose 1 of the options:");
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
        double celsius, fahrenheit, feet ,meters, onces, milliliters, liters, centimeters;
        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            celsius = keyboard.nextDouble();
            keyboard.nextLine();
            fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println("degrees celsius is "+ celsius + " degrees fahrenheit "+ fahrenheit);
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            fahrenheit= keyboard.nextDouble();
            keyboard.nextLine();
            celsius=(fahrenheit-32)/(9.0/5.0);
            System.out.println("degrees celsius is "+ celsius + " degrees fahrenheit "+ fahrenheit);
        }
        if (selection==3)
        {
            System.out.println("Enter Feet: ");
            feet = keyboard.nextDouble();
            keyboard.nextLine();
            meters = feet/3.281;
            System.out.println("Lengh feet is "+ feet + " Lengh meters is "+ meters);
        }
        if (selection==4)
        {
            System.out.println("Enter meters: ");
            meters = keyboard.nextDouble();
            keyboard.nextLine();
            feet = meters*3.281;
            System.out.println("Lengh feet is "+ feet + " Lengh meters is "+ meters);
        }
        if (selection==5)
        {
            System.out.println("Enter Onces: ");
            onces = keyboard.nextDouble();
            keyboard.nextLine();
            milliliters = onces*29.574            ;
            System.out.println("Volume onces is "+ onces + " Volume milliliters is "+ milliliters);
        }
        if (selection==6)
        {
            System.out.println("Enter Milliliters: ");
            milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            onces = milliliters/29.547;
            System.out.println("Volume onces is "+ onces + " Volume milliliters is "+ milliliters);
        }
        if (selection==7)
        {
            System.out.println("Enter centimeters: ");
            centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            meters = centimeters/100;
            System.out.println("Lengh centimeters is "+ centimeters + " Lengh meters is "+ meters);
        }
        if (selection==8)
        {
            System.out.println("Enter meters: ");
            meters = keyboard.nextDouble();
            keyboard.nextLine();
            centimeters = meters*100;
            System.out.println("Lengh centimeters is "+ centimeters + " Lengh meters is "+ meters);
        }
        if (selection==9)
        {
            System.out.println("Enter liters: ");
            liters = keyboard.nextDouble();
            keyboard.nextLine();
            milliliters = liters*1000;
            System.out.println("Volume liters is "+ liters + " Volume milliliters is "+ milliliters);
        }
        if (selection==10)
        {
            System.out.println("Enter Milliliters: ");
            milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            liters = milliliters/1000;
            System.out.println("Volume liters is "+ liters + " Volume milliliters is "+ milliliters);
        }
    }
}