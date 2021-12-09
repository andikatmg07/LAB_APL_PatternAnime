public class WibuSatu implements Observer { //class wibusatu mengimplement kepada observer
    @Override //method override
    public void update(Notifikasi n) {
        System.out.println("WibuSatu : " + n.getNotifikasiDiberikan()); //wibusatu akan mendapatkan notifikasi
    }
}
