public class WibuDua implements Observer { //class wibudua yang implement ke observer
    @Override //method override
    public void update(Notifikasi n) {
        System.out.println("WibuDua : " + n.getNotifikasiDiberikan()); //class wibu dua akan mendapatkan notifikasi
    }
}
