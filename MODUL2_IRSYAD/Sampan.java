public class Sampan extends TransportasiAir {

    protected int layar;
    protected String text;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
        
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+"layar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan"+jangkar+"jangkar");
    }
    
}
