package d12_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        Ringla a = new Ringla("obicna", 0.8);
        Ringla b = new Ringla("ekspres", 1.5);
        Ringla c = new Ringla("obicna", 0.8);
        Ringla d = new Ringla("ekspres", 1.5);
        ElektricniSporet mojSporet = new ElektricniSporet("Bosch", 7, 3, a, b, c, d);

        mojSporet.doleLevo().pojacajRinglu();
        mojSporet.doleLevo().pojacajRinglu();
        mojSporet.doleLevo().pojacajRinglu();
        mojSporet.doleLevo().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().pojacajRinglu();
        mojSporet.doleDesno().iskljuciRinglu();

        mojSporet.pojacaj(3);
        mojSporet.pojacaj(1);
        mojSporet.pojacaj(4);
        mojSporet.pojacaj(2);



        double kolikaJePotrosnja = mojSporet.potrosnja(120);
        System.out.println(kolikaJePotrosnja);

        mojSporet.print();

    }
}
