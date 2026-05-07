public class Naga extends Musuh {

    public Naga() {
        super("Naga Diare", 500);
    }

    @Override
    public void serangPemain() {
        System.out.println(namaMusuh + " menyembur kentut berdahak dari udara! Player -50 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " PRRROOOOOOOTTTTTTT");
    }
}