package d19_09_2023.Zadatak2;

public abstract class Hiker {

    protected int ID;
    protected String fullName;

    public Hiker(int ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract void print ();

    public abstract int membershipCost ();

    public abstract boolean successfulClimb (Mountain x);
}
