public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.furnitureCode=111;
        furnitureItem.furnitureType="Table";
        furnitureItem.gradeOfFurniture='A';
        furnitureItem.color="Red";
        furnitureItem.price=700.0;
        furnitureItem.furnitureUsage="outdoor";
        furnitureItem.display();

        System.out.println();
        FurnitureItem furnitureItem2 = new FurnitureItem();
        furnitureItem2.furnitureCode=112;
        furnitureItem2.furnitureType="Chair";
        furnitureItem2.gradeOfFurniture='B';
        furnitureItem2.color="Green";
        furnitureItem2.price=800.0;
        furnitureItem2.furnitureUsage="indoor";
        furnitureItem2.display();

        System.out.println();
        FurnitureItem furnitureItem3 = new FurnitureItem();
        furnitureItem3.furnitureCode=113;
        furnitureItem3.furnitureType="Cupboard";
        furnitureItem3.gradeOfFurniture='C';
        furnitureItem3.color="Blue";
        furnitureItem3.price=1000.0;
        furnitureItem3.furnitureUsage="outoor";
        furnitureItem3.display();

        System.out.println();
        System.out.println();
        FurnitureItem furnitureItem4 = new FurnitureItem();
        furnitureItem4.furnitureCode=114;
        furnitureItem4.furnitureType="Tool";
        furnitureItem4.gradeOfFurniture='B';
        furnitureItem4.color="Green";
        furnitureItem4.price=550.0;
        furnitureItem4.furnitureUsage="outdoor";
        furnitureItem4.display();
        System.out.println();
    }
}
