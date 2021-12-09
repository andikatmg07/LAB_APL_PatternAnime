public abstract class JadwalDecorator implements Jadwal { //class JadwalDecorator dimana membuat implementasi dari Jadwal
    protected Jadwal decoratorAnime; //modifier sehingga hanya bisa digunakan member

    public JadwalDecorator(Jadwal decoratorAnime) {
        this.decoratorAnime = decoratorAnime; 
    }

    public void color() {
        decoratorAnime.addJadwal();
    }
}
