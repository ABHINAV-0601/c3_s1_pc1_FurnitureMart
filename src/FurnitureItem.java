public class FurnitureItem {
    String type;
    String colour;
    int grade;
    String typeOfUse;
    String material;
    double price;

    public double flatDiscount(double discountPercentage,String typeOfUse){
        if(typeOfUse.equalsIgnoreCase("outdoor")){
                return price - (price * discountPercentage/100);
        }
        return 0.0;
    }
}
