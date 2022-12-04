public class Laptop extends Perangkat {

    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    @Override
    public void Informasi(){
        System.out.println("Laptop ini memiliki drive tipe ");

    }

    public void BukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game Dota 2");

    }

    public void KirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke ");

    }

    public void KirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke");
    }
}
