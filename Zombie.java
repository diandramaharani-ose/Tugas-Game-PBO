public class Zombie extends Musuh {
    
    public Zombie() {
        super("Zombie Toxic Kisser", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " mencium brutal! Player -20 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " cup~ muahhh~ srotttt~");
    }
}