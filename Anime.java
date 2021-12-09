public interface Anime {
    public void attach(Observer o); // method untuk menyimpan pembaruan notifikasi

    public void notifyUpdate(Notifikasi n); // method untuk update notifikasi dari mimin
}