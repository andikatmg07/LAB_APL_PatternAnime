public class Main {
    public static void main(String[] args) {
        WibuSatu w1 = new WibuSatu(); //membuat object wibusatu yang baru
        WibuDua w2 = new WibuDua(); //membuat object wibudua yang baru

        Mimin m = new Mimin(); //membuat object mimin yang baru

        m.attach(w1);
        m.attach(w2);
        m.notifyUpdate(new Notifikasi("Anime 'Demon Slayer : Kimetsu no Yaiba Season 2' Rilis pada Bulan Oktober"));
        // w1 and w2 akan diperbarui dan mendapatkan pembaruan berupa notifikasi

    }
}
