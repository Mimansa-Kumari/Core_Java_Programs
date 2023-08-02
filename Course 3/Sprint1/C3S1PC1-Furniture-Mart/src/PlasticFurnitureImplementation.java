import java.util.Scanner;
public class PlasticFurnitureImplementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Table \n2.Chair \n3.Cupboard \n4.Tools");
        System.out.println("Enter Furniture Usage Type:(Indoor/Outdoor ");
        PlasticFurniture plasticFurniture = new PlasticFurniture();
        plasticFurniture.usage = sc.nextLine();
        if (plasticFurniture.usage.equalsIgnoreCase("indoor") || plasticFurniture.usage.equalsIgnoreCase("outdoor")) {
            System.out.println("Enter your choice of Furniture : ");
            plasticFurniture.type = sc.nextLine();
            if (plasticFurniture.type.equalsIgnoreCase("Table") || plasticFurniture.type.equalsIgnoreCase("Chair") || plasticFurniture.type.equalsIgnoreCase("Cupboard") || plasticFurniture.type.equalsIgnoreCase("Tools")) {
                System.out.println("Enter the color : ");
                plasticFurniture.colors = sc.nextLine();
                if (plasticFurniture.colors.equalsIgnoreCase("Red") || plasticFurniture.colors.equalsIgnoreCase("Blue") || plasticFurniture.colors.equalsIgnoreCase("Green")) {
                    System.out.println("Enter the Grade : ");
                    plasticFurniture.grades = sc.next().charAt(0);
                    if (plasticFurniture.grades != 'A' && plasticFurniture.grades != 'B' && plasticFurniture.grades != 'C' && plasticFurniture.grades != 'a' && plasticFurniture.grades != 'b' && plasticFurniture.grades != 'c')
                        System.out.println("Invalid input");
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
        plasticFurniture.displayFurniture(plasticFurniture.type, plasticFurniture.colors, plasticFurniture.grades, plasticFurniture.usage);
    }
}