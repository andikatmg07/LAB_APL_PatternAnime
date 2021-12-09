public class WibuSatu implements Observer {
    @Override
    public void update(Notifikasi n) {
        System.out.println("WibuSatu : " + n.getNotifikasiDiberikan());
    }
}
