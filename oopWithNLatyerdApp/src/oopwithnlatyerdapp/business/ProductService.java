/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopwithnlatyerdapp.business;

import java.util.List;
import oopwithnlatyerdapp.core.logging.ILogger;
import oopwithnlatyerdapp.dataAccess.HibernateProductDao;
import oopwithnlatyerdapp.dataAccess.IProductDao;
import oopwithnlatyerdapp.dataAccess.JdbcProductDao;
import oopwithnlatyerdapp.entities.Product;

/**
 *
 * @author Lenova
 */
public class ProductService {

    private IProductDao productDao;
    private List<ILogger> loggers;

    public ProductService(IProductDao productDao, List<ILogger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }

    public void add(Product product) throws Exception {
        // iş kuralları yazılır.
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürin fiatı 1o liradan ucuz olamaz.");
        }
        productDao.add(product);

        for (ILogger logger : loggers) {
            logger.log(product.getName());
        }
    }

    public void update(Product product) {
        productDao.update(product);

        for (ILogger logger : loggers) {
            logger.log(product.getName());
        }
    }

}
