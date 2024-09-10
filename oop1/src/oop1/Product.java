/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author Lenova
 */
//PascaCase ile classlar isimledirilir
public class Product {

    private String name;
    //camelCase ile feilldlar yazılırlar.
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsInStocks;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getUnitsInStocks() {
        return unitsInStocks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setUnitsInStocks(int unitsInStocks) {
        this.unitsInStocks = unitsInStocks;
    }

}
