import java.util.ArrayList;
import java.util.List;

public class Mimin implements Anime {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyUpdate(Notifikasi n) {
        for (Observer o : observers) {
            o.update(n);

            Jadwal Jadwal = new JadwalAnimeDecorator(new NoJadwal());
            Jadwal.addJadwal();
        }
    }
}