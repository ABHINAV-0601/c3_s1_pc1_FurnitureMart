public class FurnitureItem {
    String type;
    String colour;
    int grade;
    String typeOfUse;
    String material;
    double price;

    public double flatDiscount(double discountPercentage,String typeOfUse){
        if(typeOfUse == outdoor){
                return price - (price * discountPercentage/100);
        }
    }
}
