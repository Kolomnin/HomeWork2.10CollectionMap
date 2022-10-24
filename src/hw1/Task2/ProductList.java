package hw1.Task2;

import java.util.*;

public class ProductList {
    private final HashMap<Product, Double> productList ;
    public ProductList() {
        this.productList = new HashMap<>();
    }
    public void addProduct(Product product, Double count)  {
        if (productList.equals(product.getProductName())) {
            throw new RuntimeException("Продкут: " + product.getProductName() + " есть в сумке");
        } else {
            productList.put(product, count);
        }
    }

    public HashMap<Product, Double> getProductList() {
        return productList;
    }

    public void delProduct(Product product) {
        productList.remove(product);
    }
    public Double sumPriceProduct(){
        double sum = 0;
        for (Map.Entry<Product, Double> entrySet : productList.entrySet()) {
            sum += (entrySet.getKey().getPrice() * entrySet.getValue());
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "\nСписок продуктов: " +
                productList + "\n";
    }
}