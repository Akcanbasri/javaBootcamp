/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop1;

/**
 *
 * @author Lenova
 */
public class Oop1 {

    public static void main(String[] args) {
        String message = "Vade orani";

        Product product1 = new Product();
        product1.setName("A Kahve Makinasi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("Images/image435");
        product1.setUnitsInStocks(3);

//      System.out.println(product1.name);  // gettind data
        Product product2 = new Product();
        product2.setName("B Kahve Makinasi");
        product2.setDiscount(6);
        product2.setUnitPrice(6500);
        product2.setImageUrl("Images/image435");
        product2.setUnitsInStocks(30);

        Product product3 = new Product();
        product3.setName("C Kahve Makinasi");
        product3.setDiscount(1);
        product3.setUnitPrice(5500);
        product3.setImageUrl("Images/image435");
        product3.setUnitsInStocks(17);

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println("<ul>");
            System.out.println("<li>" + product.getName() + "</li>");
            System.out.println("<li>" + product.getDiscount() + "</li>");
            System.out.println("<li>" + product.getUnitPrice() + "</li>");
            System.out.println("<li>" + product.getImageUrl() + "</li>");
            System.out.println("<li>" + product.getUnitsInStocks() + "</li>");
            System.out.println("</ul>");
            System.out.println("\n");

        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("42345345");
        individualCustomer.setPhone("53464614461");
        individualCustomer.setFirstName("Hasan Basri");
        individualCustomer.setLastName("Akcan");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("4561511");
        corporateCustomer.setPhone("5321456465");
        corporateCustomer.setCompanyName("Akcanlar");
        corporateCustomer.setTaxNumber("545641651524156");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }

}
