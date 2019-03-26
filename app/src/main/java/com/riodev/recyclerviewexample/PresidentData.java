package com.riodev.recyclerviewexample;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. Ayahnya bernama Raden Soekemi Sosrodihardjo dan ibunya Ida Ayu Nyoman Rai.", String.valueOf(R.drawable.sukarno)},
            {"Soeharto", "Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. Beliau merupakan anak keempat dari delapan bersaudara, pasangan Alwi Abdul Jalil Habibie dan RA. Tuti Marini Puspowardojo. Habibie yang menikah dengan Hasri Ainun Habibie pada tanggal 12 Mei 1962 ini dikaruniai dua orang putra yaitu Ilham Akbar dan Thareq Kemal.", String.valueOf(R.drawable.suharto)},
            {"Habibie", "Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. Beliau merupakan anak keempat dari delapan bersaudara, pasangan Alwi Abdul Jalil Habibie dan RA. Tuti Marini Puspowardojo. Habibie yang menikah dengan Hasri Ainun Habibie pada tanggal 12 Mei 1962 ini dikaruniai dua orang putra yaitu Ilham Akbar dan Thareq Kemal.", String.valueOf(R.drawable.habibie)},
            {"Abdurrahman Wahid", "Gus Dur adalah putra pertama dari enam bersaudara yang dilahirkan di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940. Secara genetik Gus Dur adalah keturunan “darah biru”. Ayahnya, K.H. Wahid Hasyim adalah putra K.H. Hasyim Asy’ari, pendiri jam’iyah Nahdlatul Ulama (NU)-organisasi massa Islam terbesar di Indonesia-dan pendiri Pesantren Tebu Ireng Jombang.", String.valueOf(R.drawable.gusdur)},
            {"Megawati", "Presiden Republik Indonesia ke-5, Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. Sebelum diangkat sebagai presiden, beliau adalah Wakil Presiden RI yang ke-8 dibawah pemerintahan Abdurrahman Wahid. Megawati adalah putri sulung dari Presiden RI pertama yang juga proklamator, Soekarno dan Fatmawati.", String.valueOf(R.drawable.megawati)},
            {"SBY", "Berbeda dengan presiden sebelumnya, beliau merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004. Lulusan terbaik AKABRI (1973) yang akrab disapa SBY ini lahir di Pacitan, Jawa Timur 9 September 1949. Istrinya bernama Kristiani Herawati, merupakan putri ketiga almarhum Jenderal (Purn) Sarwo Edhi Wibowo.", String.valueOf(R.drawable.susilo)},
            {"Jokowi", "Pemimpin sederhana,bersih, dan merakyat, itulah hal yang banyak melekat pada sosok presiden Indonesia, Ir. H. Joko Widodo atau kerap disapa Jokowi", String.valueOf(R.drawable.jokowi)}
    };

    public static long[] dataPhoto = new long[]{
            R.drawable.sukarno,
            R.drawable.suharto,
            R.drawable.habibie,
            R.drawable.gusdur,
            R.drawable.megawati,
            R.drawable.susilo,
            R.drawable.jokowi,
    };

    public static ArrayList<President> getListData(){
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            President president = new President();
            president.setName(aData[0]);
            president.setDescription(aData[1]);
            president.setPhoto(aData[2]);
            list.add(president);
        }
        return list;
    }
}
