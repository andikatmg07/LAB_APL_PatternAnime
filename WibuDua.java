public class WibuDua implements Observer {
    @Override
    public void update(Notifikasi n) {
        System.out.println("WibuDua : " + n.getNotifikasiDiberikan());
    }
}
