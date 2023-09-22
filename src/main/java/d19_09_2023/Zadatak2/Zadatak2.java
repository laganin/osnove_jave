package d19_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        MountainHouse myHouse = new MountainHouse("My house", 1989);
        Mountain mountain1 = new Mountain("Planina", "Serbia", 2000);

        myHouse.addHiker(new Mountaineer(1, "Milan Jovanovic", 3));
        myHouse.addHiker(new Mountaineer(4, "Pera Peric", 1));
        myHouse.addHiker(new Mountaineer(22, "Jovan Jovanovic", 0));

        myHouse.addHiker(new RecreationalHiker(7, "Vladimir Minic", 3, "Niski", 900));
        myHouse.addHiker(new RecreationalHiker(33, "Petar Petrovic", 7, "Beogradski", 1500));
        myHouse.addHiker(new RecreationalHiker(99, "Petar Jovanovic", 5, "Suboticki", 1800));

        myHouse.print();
        myHouse.numberOfSuccessfulClimbers(mountain1);
        myHouse.kickOut(99);
        myHouse.print();
        System.out.println(myHouse.income());




    }
}
