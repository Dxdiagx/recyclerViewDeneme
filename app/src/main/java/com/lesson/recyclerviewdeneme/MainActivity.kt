package com.lesson.recyclerviewdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var sporListesi=ArrayList<String>()

        sporListesi.add("Futbol Icerikleri")
        sporListesi.add("Basketbol Icerikleri")
        sporListesi.add("Tenis Icerikleri")
        sporListesi.add("Voleybol Icerikleri")
        sporListesi.add("Hentbol Icerikleri")
        sporListesi.add("Kayak Icerikleri")
        sporListesi.add("Yüzme Icerikleri")

        var sporIcerigi=ArrayList<String>()
        sporIcerigi.add("Futbol, on birer oyuncudan oluşan iki takım arasında, " +
                "kendine özgü küresel bir topla oynanan takım sporudur." +
                " 21. yüzyıl itibarıyla 200'ün üzerinde ülkede 250 milyonu aşkın oyuncu " +
                "tarafından oynanmakta olup dünyadaki en popüler spordur.")
        sporIcerigi.add("Profesyonel basketbolda beşer kişilik iki takım, " +
                "yerden yüksekliği Avrupa standartlarına göre 3,05 metre olan ve pota adı verilen," +
                " yere paralel konumdaki bir çemberden topu geçirerek, rakibinden daha fazla sayı yapmak suretiyle, " +
                "on ikişer, onar veya sekizer dakikalık dört periyottan oluşan maçı kazanmaya çalışır.")
        sporIcerigi.add("Tenis, karşılıklı iki kişi ya da ikişer kişiden oluşan takımlarla, " +
                "dikdörtgen düz bir kortta oynanır. Oyuncular, ellerindeki tenis raketi ile " +
                "topa vurarak topu sahanın ortasındaki filenin üzerinden rakip takımın kortuna geçirmeyi amaçlarlar. " +
                "Top ikiden fazla sekerse sayı, topa vuran tarafa yazılır.")
        sporIcerigi.add("Morgan tarafından 9 Şubat 1895'te tasarlandı. " +
                "Bir kapalı alan sporu olarak 1895'te oynanmaya başlandı. " +
                "Morgan, bu oyunu mintonette olarak adlandırmıştı; " +
                "daha sonraları topa yere değmeden vurma ilkesinden (vole) yola çıkılarak " +
                "voleybol adı önerildi ve oyun bu adla tanındı.")
        sporIcerigi.add("Hentbolun amacı, takımınızla beraber uyum içinde çalışarak elinizdeki" +
                " topu karşı kaleye gol olarak atmaktır. 12 kişilik kadrolarla oynanan hentbolda " +
                "ayak ve diz altı kısımlar top ile temas etmemelidir. " +
                "Sahada 6 oyuncu ve bir kaleci bulunmalıdır. " +
                "Topu el yardımıyla karşı kaleye gol olarak atmanız gerekmektedir.")
        sporIcerigi.add("Kayak sporu; Kar ve buz üzerinde kayarak yol almak için ayaklara takılan uzun ve yassı satıhlı," +
                " ön uçları hafif yukarı ve arkaya kıvrık bir alet olan Kayak ile yapılan spor dalının adıdır.")
        sporIcerigi.add("Yüzmenin en temel faydalarından birisi kas ve eklemlerin çalışmasını desteklemesidir. " +
                "Yüzme sporu, tüm yaş gruplarında kasların kuvvetinin artırılmasında, eklemlerin hareket yeteneğinin artırılmasında fayda sağlar. " +
                "Aynı zamanda kas ve eklemlerin hareket sıklığı arttığı için vücudun genelinde bir esneklik sağlar.")

        val futbolDrawable=R.drawable.futbol
        val basketbolDrawable=R.drawable.basketbol
        val tenisDrawable=R.drawable.tenis
        val voleybolDrawable=R.drawable.voleybol
        val hentbolDrawable=R.drawable.hentbol
        val kayakDrawable=R.drawable.kayak
        val yuzmeDrawable=R.drawable.yuzme

        val  sporGorselListesi=ArrayList<Int>()
        sporGorselListesi.add(futbolDrawable)
        sporGorselListesi.add(basketbolDrawable)
        sporGorselListesi.add(tenisDrawable)
        sporGorselListesi.add(voleybolDrawable)
        sporGorselListesi.add(hentbolDrawable)
        sporGorselListesi.add(kayakDrawable)
        sporGorselListesi.add(yuzmeDrawable)



         val recyclerView : RecyclerView=findViewById(R.id.recyclerView)
        val LayoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=LayoutManager
        val adapter=RecyclerAdapter(sporListesi,sporIcerigi,sporGorselListesi)
        recyclerView.adapter=adapter


    }
}