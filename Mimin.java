import java.util.ArrayList;
import java.util.List;

public class Mimin implements Anime { //implementasi kepada class Anime

    private List<Observer> observers = new ArrayList<>();

    @Override //method override
    public void attach(Observer o) {
        observers.add(o); //menambah observer
    }

    @Override //method override
    public void notifyUpdate(Notifikasi n) { //memberikan notifikasi update
        for (Observer o : observers) {
            o.update(n); 

            Jadwal Jadwal = new JadwalAnimeDecorator(new NoJadwal());
            Jadwal.addJadwal();
        }
    }
}
