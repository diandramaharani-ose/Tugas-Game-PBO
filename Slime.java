public class Slime extends Musuh {
    
    public Slime() {
        super("Si Lengket", 50);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " melompat dan menyemprotkan ludah! Player -15 HP");
    }

     @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " CUH!");
    }
}