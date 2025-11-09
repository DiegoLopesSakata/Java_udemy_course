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

    System.out.printf("Product data: %s, $%.2f, %d units, Total: $%.2f\n\n", produto.name, produto.price, produto.quantity, produto.TotalValueInStock());

    System.out.print("Enter the number of products to be added in the stock: ");
    var add = sc.nextInt();
    produto.AddProduct(add);

    System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f\n\n", produto.name, produto.price, produto.quantity, produto.TotalValueInStock());

    System.out.print("Enter the number of products to be removed from stock: ");
    var remove = sc.nextInt();
    produto.RemoveProducts(remove);

    System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f\n\n", produto.name, produto.price, produto.quantity, produto.TotalValueInStock());

    sc.close();
}
