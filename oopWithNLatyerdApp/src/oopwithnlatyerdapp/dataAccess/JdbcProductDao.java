/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopwithnlatyerdapp.dataAccess;

import oopwithnlatyerdapp.entities.Product;

/**
 *
 * @author Lenova
 */
public class JdbcProductDao implements IProductDao {

    @Override
    public void add(Product product) {
        // sadece ve sadece db erişimi kodları buraya yazılır.
        System.out.println("JDBC ile veri tabanina eklendi.");
    }

    @Override
    public void update(Product product) {
        System.out.println("JDBC ile veri guncellendi");
    }

}

// Hibernate
