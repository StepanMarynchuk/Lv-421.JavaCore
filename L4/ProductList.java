
public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("car", 500, 100);
		Product p2 = new Product("apple", 20, 200);
		Product p3 = new Product("candy", 90, 60);
		Product p4 = new Product("computer", 1000, 10);

		System.out.println("The most expensive product:"
				+ Product.ExpProduct(p1, Product.ExpProduct(p2, Product.ExpProduct(p3, p4))));

	}

}
