/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopwithnlatyerdapp;

import java.util.Arrays;
import java.util.List;
import oopwithnlatyerdapp.business.ProductService;
import oopwithnlatyerdapp.core.logging.DatabaseLogger;
import oopwithnlatyerdapp.core.logging.FileLogger;
import oopwithnlatyerdapp.core.logging.ILogger;
import oopwithnlatyerdapp.core.logging.MailLogger;
import oopwithnlatyerdapp.dataAccess.HibernateProductDao;
import oopwithnlatyerdapp.dataAccess.JdbcProductDao;
import oopwithnlatyerdapp.entities.Product;

/**
 *
 * @author Lenova
 */
public class OopWithNLatyerdApp {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Phone", 10000);

        List<ILogger> loggers = Arrays.asList(new DatabaseLogger(), new FileLogger(), new MailLogger());

        ProductService productService = new ProductService(new HibernateProductDao(), loggers);
        productService.add(product1);
        System.out.println("*********************************");
        productService.update(product1);
    }
}
