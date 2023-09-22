package d19_09_2023.Zadatak2;

public class Mountaineer extends Hiker{

    private int points;

    public Mountaineer(int ID, String fullName, int points) {
        super(ID, fullName);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public void print() {
        System.out.println("Mountaineer, ID: " + this.ID);
        System.out.println("Name: " + this.fullName);
        System.out.println("Accumulated points: " + this.points);
    }

    @Override
    public int membershipCost() {
        if (this.points>0){
            return 1500 - this.points * 50;
        }
        return 1500;
    }

    @Override
    public boolean successfulClimb(Mountain x) {
        return x.getHeight()<4000;
    }
}
