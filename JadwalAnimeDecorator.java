public class JadwalAnimeDecorator extends JadwalDecorator { //class JadwalAnime yang mengextend ke class JadwalDecorator
    public JadwalAnimeDecorator(Jadwal decoratorAnime) {
        super(decoratorAnime); //method ini mempresentasikan class induk dari decoratorAnime
    }

    @Override //menggunakan method override
    public void addJadwal() { 
        decoratorAnime.addJadwal(); //decoratorAnime akan ditambahkan jadwal lengkapnya
        setAnimeJadwal(decoratorAnime);
    }

    private void setAnimeJadwal(Jadwal decoratorAnime) {
        System.out.println("Tanggal Rilis : 10 Oktober 2021 \n"); //menambahkan dekorasi berupa tanggal rilis anime
    }
}
