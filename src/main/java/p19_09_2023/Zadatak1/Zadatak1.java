package p19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        TaxOffice taxAdministration = new TaxOffice("Novi Sad");
        taxAdministration.addBuilding(new House("Suncani kej 1", 55, 1, 3));
        taxAdministration.addBuilding(new House("Trg neznanog junaka 5", 67, 3, 2));
        taxAdministration.addBuilding(new Skyscraper("Mileticeva 54", 100, 2, 3));
        taxAdministration.addBuilding(new Skyscraper("Skerliceva 7", 80, 1, 7));
        taxAdministration.addBuilding(new CommercialSpace("Beogradski kej 39", 30, 2));

        System.out.println(taxAdministration.highestTax().getAddress());
        System.out.println(taxAdministration.lowestTax().getAddress());
        System.out.println("Total city tax is " + taxAdministration.totalTax());
        System.out.println();
        taxAdministration.print();
    }

}
