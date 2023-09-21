package d19_09_2023;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Packaging> packs;

    public ShoppingCart() {
        this.packs = new ArrayList<>();
    }

    public ArrayList<Packaging> getPacks() {
        return packs;
    }

    public void setPacks(ArrayList<Packaging> packs) {
        this.packs = packs;
    }

    public void addPackaging(Packaging x) {
        this.packs.add(x);
    }

    public void removePackaging(String barcode) {
        for (int i = 0; i < this.packs.size(); i++) {
            if (barcode.equals(this.packs.get(i).barcode)) {
                this.packs.remove(this.packs.get(i));
            }
        }
    }


    private ArrayList<Double> priceWithDiscount(double discount) {
        ArrayList<Double> prices = new ArrayList<>();
        for (int i = 0; i < this.packs.size(); i++) {
            double discountedPrice = this.packs.get(i).price() - discount;
            prices.add(discountedPrice);
        }
        return prices;
    }

    public double totalPrice(SuperCard x) {
        double total = 0;
        ArrayList<Double> prices;
        prices = priceWithDiscount(x.getDiscount());
        for (int i = 0; i < prices.size(); i++) {
            total = total + prices.get(i);
        }
        return total;
    }
}
