package d19_09_2023.Zadatak1;

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


    private double priceWithDiscount(double discount) {
        double total = 0;
        for (int i = 0; i < this.packs.size(); i++) {
            total += this.packs.get(i).price();
        }
        return total - discount;
    }

    public double totalPrice(SuperCard x) {
      return this.priceWithDiscount(x.getDiscount());
    }
}
