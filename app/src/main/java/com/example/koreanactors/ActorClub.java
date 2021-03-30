package com.example.koreanactors;

import java.util.ArrayList;

public class ActorClub {
    private static String [] actorname = {
            "Lee Do Hyun",
            "Songkang",
            "Kim Seon Ho",
            "Park Seo Jun",
            "Lee Min Ho",
            "Ji Chang Wook",
            "Kim Soo Hyun"

    };

    private static String [] actordetail = {
            "Lee Do Hyun adalah seorang aktor asal Korea Selatan yang berumur 25 tahun yang membintangi drama yang berjudul Sweet Home",
            "Songkang merupakan aktor asal Korea Selatan yang hangat menjadi perbincangan karena ketampanan dan bakatnya dalam acting. Songkang juga membintangi drama Sweet Home bersama dengan Lee Do Hyun",
            "Kim Seon Ho merupakan aktor yang memiliki wajah yang sangat manis. Ia sangat baik hati",
            "Park Seo Jun adalah aktor yang sangat ramah, tampan dan juga lucu. Perannya pun dalam drama juga tak kalah hebatnya dengan aktor lainnya",
            "Lee Min Ho adalah aktor asal Korea Selatan yang sudah sangat terkenal dan snagat sukses dalam dunia perdramaan. Film yang dimainkan selalu memiliki rating diatas perkiraan",
            "Ji Chang Wook merupakan aktor tampan kore selatan yang selalu mendapatkan peran lelaki cool yang selalu mendapatkan misi rahasia",
            "Kim Soo Hyun adalah aktor korea selatan yang perannya selalu memiliki hati lembut"

    };

    private static int[] actorimage = {
            R.drawable.dohyun,
            R.drawable.songkang,
            R.drawable.seonho,
            R.drawable.seojoon,
            R.drawable.minho,
            R.drawable.changwook,
            R.drawable.soohyun


    };

    static ArrayList<Actor> getListData(){
        ArrayList<Actor> list = new ArrayList<>();
        for (int position = 0; position <actorname.length; position++) {
            Actor actor = new Actor();
            actor.setName(actorname[position]);
            actor.setDetail(actordetail[position]);
            actor.setPhoto(actorimage[position]);
            list.add(actor);
        }
        return list;
    }

}
