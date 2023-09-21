package d19_09_2023;

public abstract class Packaging {
    protected String barcode;
    protected String article;
    protected double netWeight;
    protected double grossWeight;

    public Packaging() {
    }

    public Packaging(String barcode, String article, double netWeight, double grossWeight) {
        this.barcode = barcode;
        this.article = article;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double weight() {
        return this.grossWeight - this.netWeight;
    }

    public abstract double price();

    public abstract void print();
}
