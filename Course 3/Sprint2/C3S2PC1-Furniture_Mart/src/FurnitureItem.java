public class FurnitureItem {
    public int furnitureCode;
    public String furnitureType;
    public char gradeOfFurniture;
    public String color;
    public String furnitureUsage;
    public double price;

    //Use of no-argument Constructor
    public FurnitureItem()
    {
        this.furnitureCode=0;
        this.furnitureType=null;
        this.gradeOfFurniture='\u0000';
        this.color=null;
        this.furnitureUsage=null;
        this.price=0.0;
    }

    public double calculateDiscount()
    {
        if (this.furnitureUsage.equalsIgnoreCase("outdoor"))
        {
            return this.price=0.95*this.price;
        }
        else
        {
            System.out.println("You are not eligible for discount");
            return this.price;
        }
    }
    void display()
    {
        System.out.println("Furniture code = "+this.furnitureCode);
        System.out.println("Furniture type = "+this.furnitureType);
        System.out.println("Grade of Furniture = "+this.gradeOfFurniture);
        System.out.println("Color of Furniture = "+this.color);
        System.out.println("Furniture Usage = "+this.furnitureUsage);
        System.out.println("Price of Furniture before = "+this.price);
        System.out.println("Furniture Usage = "+this.furnitureUsage);
        System.out.println("Price of Furniture after discount = "+calculateDiscount());
    }
}
