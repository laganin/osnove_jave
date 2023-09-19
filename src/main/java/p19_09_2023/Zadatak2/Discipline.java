package p19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Discipline {

    private String name;
    private String type;
    private ArrayList<Athlete> athletes;

    public Discipline() {
    }

    public Discipline(String name, String type) {
        this.name = name;
        this.type = type;
        this.athletes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }

    public void addAthlete(Athlete x) {
        this.athletes.add(x);
    }

    public void disqualify(String fullName) {
        for (int i = 0; i < this.athletes.size(); i++) {
            if (fullName.equals(this.athletes.get(i).getFullName())) {
                this.athletes.remove(i);
            }
        }
    }

    public Athlete bestResult() {
        Athlete best = this.athletes.get(0);
        for (int i = 0; i < this.athletes.size(); i++) {
            if (this.athletes.get(i).betterResult(best)) {
                best = this.athletes.get(i);
            }
        }
        return best;
    }

    public void winner() {
        bestResult().print();
    }
}
