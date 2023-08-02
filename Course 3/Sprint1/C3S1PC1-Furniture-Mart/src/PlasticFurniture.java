import java.util.Scanner;
public class PlasticFurniture {
    String type, colors, usage;
    char grades;
    public void calculateGivenDiscount(String usage, String order)
    {
        if(usage.equalsIgnoreCase("indoor"))
        {
            System.out.println("You are eligible for 5% of Discount");
        }
    }
    public void displayFurniture(String type, String color, char grade,String usage)
    {
        double sum=0.0;
        System.out.println("Furniture = "+type);
        System.out.println("Color = "+color);
        System.out.println("Grade = "+grade);
        calculateGivenDiscount(usage, type);
    }

}

