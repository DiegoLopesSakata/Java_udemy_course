public class Product {
    String name;
    double price;
    int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }

    public void AddProduct(int quant){
        quantity += quant;
    }

    public void RemoveProducts(int quant){
        if(quant > quantity){
            System.out.println("There's only " + quantity + " in the storage");
        }
        else{
            quantity -= quant;
        }
    }
}