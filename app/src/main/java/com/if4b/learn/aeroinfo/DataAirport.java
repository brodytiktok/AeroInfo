package com.if4b.learn.aeroinfo;

import java.util.ArrayList;
//
public class DataAirport {
    public static String [][] data = new String[][]{
            {"CGK","WIII","Bandar Udara Internasional Soekarno-Hatta","Indonesia","Banten","Bandar Udara Internasional Soekarno–Hatta, Jakarta, Pajang, Kec. Tangerang, Kota Tangerang, Banten 19120, Indonesia","62215505179","https://kfmap.asia/thumbs/photos/ID.JV.AP.CGK1/ID.JV.AP.CGK_4.png"},
            {"WADD, WRRR","DPS","Bandar Udara Internasional Ngurah Rai","Indonesia","Bali","Jalan Raya Gusti Ngurah Rai, Tuban, Kec. Kuta, Kabupaten Badung, Bali 80362","+62 361 9351011","https://cdn1-production-images-kly.akamaized.net/GUZISx7M9SWbxs6NC7qwoRlzTZw=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3401247/original/020503400_1615778175-WhatsApp_Image_2021-03-15_at_09.58.09.jpeg"},
            {"WIPP","PLM","Bandar Udara Internasional Sultan Mahmud Badaruddin II","Indonesia","Sumatera Selatan","Jl. Bandara Sultan Mahmud Badaruddin II, Talang Betutu, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30761","(0711) 385000","https://kissparry.files.wordpress.com/2018/02/smb2-20180301-at-074805-new.jpeg"},
            {"WIEE, WIPT","PDG","Bandara Internasional Minangkabau","Indonesia","Sumatera Barat","676M+97G, Katapiang, Batang Anai, Padang Pariaman Regency, West Sumatra 25586","(0751) 819123","https://padang.go.id/uploads/images/image_default_6218435634830.jpg"},
            {"WAHS, WARS, WIIS","SRG","Bandar Udara Internasional Jenderal Ahmad Yani","Indonesia","Semarang","29MF+FX9, Tambakharjo, Semarang Barat, Semarang City, Central Java 50149","+62 24 86000600","https://cdn.antaranews.com/cache/800x533/2021/08/06/IMG-20210806-WA0009_2.jpg"},
            {"WAHI","YIA","Bandara Internasional Yogyakarta, Yogyakarta","Indonesia","DIY Yogyakarta","Kepek, Palihan, Temon, Kulon Progo Regency, Special Region of Yogyakarta 55654","(0274) 4606000","https://images.bisnis-cdn.com/posts/2022/02/09/1498608/bandara-yia.jpg"},
            {"WALL, WRLL","BPN","Sultan Aji Muhammad Sulaiman Sepinggan International Airport","Indonesia","Balikpapan","Jl. Marsma R. Iswahyudi, Sepinggan, Kecamatan Balikpapan Selatan, Kota Balikpapan, Kalimantan Timur 76115","(0542) 766886","https://sepinggan-airport.com/frontend/uploads/defaults/z0qvHI20200413150250.jpeg"},
            {"WAAA","UPG","Bandar Udara Internasional Sultan Hasanuddin","Indonesia","Makassar","Jalan Airport No.1, Kec. Makassar, Kabupaten Maros, Sulawesi Selatan 90552","(0411) 550123","https://www.otban5.com/assets/img/mockup/makassar.jpg"},
            {"WIMM","KNO","Bandar Udara Internasional Kualanamu","Indonesia","Sumatera Utara","JVJG+F2P, Jl. Bandara Kuala Namu, Ps. Enam Kuala Namu, Kec. Beringin, Kabupaten Deli Serdang, Sumatera Utara 20553","(061) 88880300","https://statics.indozone.news/content/2021/11/24/RMslBnp/bandara-kualanamu-dijual-ke-perusahaan-india-rp-85-6-triliun-warga-sumut-protes37_700.jpg"}


    };
    public static ArrayList<ModelAirport> ambilDataAirport(){
        ArrayList<ModelAirport> dataAirport = new ArrayList<>();
        for (String[] varData : data){
            ModelAirport model = new ModelAirport();

            model.setICAO(varData[0]);
            model.setIATA(varData[1]);
            model.setAirport(varData[2]);
            model.setCountry(varData[3]);
            model.setRegion(varData[4]);
            model.setAddress(varData[5]);
            model.setTelephone(varData[6]);
            model.setPhoto(varData[7]);

            dataAirport.add(model);
        }
        return dataAirport;
    }
}
