/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oopwithnlatyerdapp.dataAccess;

import oopwithnlatyerdapp.entities.Product;

/**
 *
 * @author Lenova
 */
public interface IProductDao {

    void add(Product product);

    void update(Product product);

}
