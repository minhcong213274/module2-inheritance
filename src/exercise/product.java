package exercise;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class product {
    private final int idProduct;
    private String nameProduct;
    private Date dateProduction,dateExpired;
    private double price = 1000;

    public product(int idProduct, String nameProduct, Date dateProduction, Date dateExpired, double price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.dateProduction = dateProduction;
        this.dateExpired = dateExpired;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Date getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(Date dateProduction) {
        this.dateProduction = dateProduction;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isExpired(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int yearToday = calendar.get(Calendar.YEAR);
        int monthToday = calendar.get(Calendar.MONTH);
        int dayToday = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(dateExpired);
        int yearExpired = calendar.get(Calendar.YEAR);
        int monthExpired = calendar.get(Calendar.MONTH);
        int dayExpired = calendar.get(Calendar.DAY_OF_MONTH);
        return yearExpired < yearToday
                || (yearExpired == yearToday && monthExpired < monthToday)
                || (yearExpired == yearToday && monthExpired == monthToday && dayExpired < dayToday);
    }


    public static void main(String[] args) {
        product product = new product(3,"xe",new Date(2020,2,2),new Date(3000,2,10),2000);
        System.out.println(product.isExpired());
    }
}
