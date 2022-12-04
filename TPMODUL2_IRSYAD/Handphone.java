public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void Informasi(){
        if (fingerprint == true){
            System.out.println("Handphone ini memiliki drive");
    
        }else{
            System.out.println("Handphone ini memiliki drive");
        }
    }
    public void Telfon(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS");
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke");
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke");
    }

}
