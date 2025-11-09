import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    var produto = new Product();

    System.out.print("Enter product name: ");
    var name = sc.nextLine();
    produto.name = name;

    System.out.print("Enter product price: ");
    var price = sc.nextDouble();
    produto.price = price;

    System.out.print("Enter product quantity: ");
    var quantity = sc.nextInt();
    produto.quantity = quantity;

    System.out.println("Product data: " + produto + "\n");

    System.out.print("Enter the number of products to be added in the stock: ");
    var add = sc.nextInt();
    produto.AddProduct(add);

    System.out.println("Updated data:" + produto + "\n");

    System.out.print("Enter the number of products to be removed from stock: ");
    var remove = sc.nextInt();
    produto.RemoveProducts(remove);

    System.out.println("Updated data: " + produto);

    sc.close();
}
