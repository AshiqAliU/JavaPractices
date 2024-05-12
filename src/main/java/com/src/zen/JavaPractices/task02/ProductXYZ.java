package com.src.zen.JavaPractices.task02;

import com.src.zen.JavaPractices.task02.model.Product;

public class ProductXYZ {
    private Product[] products;

    public ProductXYZ(Product[] products){
        this.products=products;
    }

    public int findPidOfHighestPricedProduct() {
        int index = 0;
        double highestPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                index = i;
            }
        }
        return products[index].getPid();
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public static void main(String[] args) {
        Product product[]= {new Product(123, 29.00, 2),
                new Product(124, 19.00, 1),
                new Product(125, 129.00, 3),
                new Product(126, 229.00, 5),
                new Product(127, 239.00, 7)};

        ProductXYZ productXYZ=new ProductXYZ(product);
        System.out.println("Find Pid of Highest Price :"+productXYZ.findPidOfHighestPricedProduct());
        System.out.println("Calculate Total Amount : "+productXYZ.calculateTotalAmount());
    }

}
