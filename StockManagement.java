package mini_project;

import java.io.Serializable;

class StockManagement implements Serializable{
    private int id;
    private String name;
    private int qty;
    private double uniPrice;
    private String df = "MM/dd/yyyy";

    StockManagement(int id, String name, int qty, double uniPrice, String df) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.uniPrice = uniPrice;
        this.df = df;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUniPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }

    public void setDf(String df) {
        this.df = df;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getQty() {
        return qty;
    }

    double getUniPrice() {
        return uniPrice;
    }

    String getDf() {
        return df;
    }
}
