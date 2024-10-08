//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner Scanner=new Scanner(System.in);
    System.out.println("Enter tank gas gallon");
    double gas_gallon=Scanner.nextInt();
    System.out.println("Enter miles per gallon");
    double miles=Scanner.nextInt();
    System.out.println("Enter price per gallon");
    double price=Scanner.nextInt();
    double hundred_miles= 100*price;
    double distance= gas_gallon*miles;

    do {System.out.println("The cost to drive 100 miles is $" + hundred_miles);
        if (price > 0){break;}
    }while(price > 0);

    do {System.out.println("Your car can go " + distance + " miles on a full tank");
        if (gas_gallon > 0 && miles > 0){break;}
    }while (gas_gallon > 0 && miles > 0);
    }
}