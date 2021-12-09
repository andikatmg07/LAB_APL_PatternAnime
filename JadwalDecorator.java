public abstract class JadwalDecorator implements Jadwal {
    protected Jadwal decoratorAnime;

    public JadwalDecorator(Jadwal decoratorAnime) {
        this.decoratorAnime = decoratorAnime;
    }

    public void color() {
        decoratorAnime.addJadwal();
    }
}
