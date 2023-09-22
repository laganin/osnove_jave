package d19_09_2023.Zadatak2;

public class RecreationalHiker extends Hiker {

    private int equipmentWeight;
    private String county;
    private int canReach;

    public RecreationalHiker(int ID, String fullName, int equipmentWeight, String county, int canReach) {
        super(ID, fullName);
        this.equipmentWeight = equipmentWeight;
        this.county = county;
        this.canReach = canReach;
    }

    @Override
    public void print() {
        System.out.println("Recreationist, ID: " + this.ID);
        System.out.println("Name: " + this.fullName);
        System.out.println("County: " + this.county);
    }

    @Override
    public int membershipCost() {
        return 1000;
    }

    @Override
    public boolean successfulClimb(Mountain x) {
        if (this.equipmentWeight > 0) {
            return this.canReach - this.equipmentWeight * 50 > x.getHeight();
        } else return this.canReach > x.getHeight();
    }
}
