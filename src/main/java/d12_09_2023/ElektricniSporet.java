package d12_09_2023;

public class ElektricniSporet {

    private String marka;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return this.marka;
    }

    public int getGarancija() {
        return this.garancija;
    }

    public int getMaxBrojUkljucenihRingli() {
        return this.maxBrojUkljucenihRingli;
    }

    public Ringla goreLevo() {
        return this.goreLevo;
    }

    public Ringla goreDesno() {
        return this.goreDesno;
    }

    public Ringla doleLevo() {
        return this.doleLevo;
    }

    public Ringla doleDesno() {
        return this.doleDesno;
    }

    public void iskljuci(int pozicijaRingle) {
        if (pozicijaRingle == 1) {
            this.goreLevo.iskljuciRinglu();
            this.goreLevo.ringlaRadi();
        }

        if (pozicijaRingle == 2) {
            this.goreDesno.iskljuciRinglu();
            this.goreDesno.ringlaRadi();
        }

        if (pozicijaRingle == 3) {
            this.doleLevo.iskljuciRinglu();
            this.doleLevo.ringlaRadi();
        }

        if (pozicijaRingle == 4) {
            this.doleDesno.iskljuciRinglu();
            this.doleDesno.ringlaRadi();
        }

    }
    int brojUkljucenih = 0;
    public void pojacaj(int pozicijaRingle) {

        if (pozicijaRingle == 1) {
            this.goreLevo.pojacajRinglu();
            this.goreLevo.ringlaRadi();
            brojUkljucenih++;
            if (maxBrojUkljucenihRingli < brojUkljucenih) {
                iskljuci(2);
                iskljuci(3);
                iskljuci(4);
                brojUkljucenih = 1;
            }
        }

        if (pozicijaRingle == 2) {
            this.goreDesno.pojacajRinglu();
            this.goreDesno.ringlaRadi();
            brojUkljucenih++;
            if (maxBrojUkljucenihRingli < brojUkljucenih) {
                iskljuci(1);
                iskljuci(3);
                iskljuci(4);
                brojUkljucenih = 1;
            }
        }

        if (pozicijaRingle == 3) {
            this.doleLevo.pojacajRinglu();
            this.doleLevo.ringlaRadi();
            brojUkljucenih++;
            if (maxBrojUkljucenihRingli < brojUkljucenih) {
                iskljuci(2);
                iskljuci(1);
                iskljuci(4);
                brojUkljucenih = 1;
            }
        }

        if (pozicijaRingle == 4) {
            this.doleDesno.pojacajRinglu();
            this.doleDesno.ringlaRadi();
            brojUkljucenih++;
            if (maxBrojUkljucenihRingli < brojUkljucenih) {
                iskljuci(2);
                iskljuci(3);
                iskljuci(1);
                brojUkljucenih = 1;
            }
        }
    }

    public double potrosnja (double vreme){
       return this.doleDesno.potrosnjaRingle(vreme) + this.doleLevo.potrosnjaRingle(vreme) + this.goreLevo.potrosnjaRingle(vreme) + this.goreDesno.potrosnjaRingle(vreme);
    }

    public void print (){
        System.out.println(this.marka + " - " + this.garancija);
        System.out.println();
        System.out.println("Ringle:");
        System.out.println("Dole desno:");
        this.doleDesno.print();
        System.out.println();
        System.out.println("Dole levo:");
        this.doleLevo.print();
        System.out.println();
        System.out.println("Gore desno:");
        this.goreDesno.print();
        System.out.println();
        System.out.println("Gore levo:");
        this.goreLevo.print();
    }
}
