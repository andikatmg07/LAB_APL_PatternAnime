public class JadwalAnimeDecorator extends JadwalDecorator {
    public JadwalAnimeDecorator(Jadwal decoratorAnime) {
        super(decoratorAnime);
    }

    @Override
    public void addJadwal() {
        decoratorAnime.addJadwal();
        setAnimeJadwal(decoratorAnime);
    }

    private void setAnimeJadwal(Jadwal decoratorAnime) {
        System.out.println("Tanggal Rilis : 10 Oktober 2021 \n");
    }
}