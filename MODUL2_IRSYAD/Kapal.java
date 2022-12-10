public class Kapal extends TransportasiAir {
    

    
    protected String mesin;
    protected String text;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;

    }

    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan"+mesin+"dengan kecepatan yang tidak stabil");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan"+mesin"dengan kecepatan stabil di kisaran);
    }
    
    public void berlayar(int kecepatan){

    }


}
