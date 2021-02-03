package com.example.soccerquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MadridrecyclerActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madridrecycler)
        recyclerView = findViewById(R.id.imageRecyclerView)

        val surati = ArrayList<Madrid_images>()

        surati.add(Madrid_images("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Real_Madrid_C.F._the_Winner_Of_The_Champions_League_in_2018_%281%29.jpg/1200px-Real_Madrid_C.F._the_Winner_Of_The_Champions_League_in_2018_%281%29.jpg"))
        surati.add(Madrid_images("https://www.calcionews24.com/wp-content/uploads/2017/06/real-madrid-champions-league-giugno-2017-1200x900.jpg"))
        surati.add(Madrid_images("https://imagens.brasil.elpais.com/resizer/xK1dQxvmaFPnHGgten_hkYR4SNg=/1500x0/arc-anglerfish-eu-central-1-prod-prisa.s3.amazonaws.com/public/IABTZ3ECYFTFOIJMIKN345VM2I.jpg"))
        surati.add(Madrid_images("https://images.daznservices.com/di/library/GOAL/1b/e9/cristiano-ronaldo-real-madrid-champons-league_13wnw3yuz1nd51f9hso5zns1gf.jpg?t=-738974200&quality=60&w=1200&h=800"))
        surati.add(Madrid_images("https://img.bleacherreport.net/img/images/photos/003/844/989/hi-res-8a8f90b0d1260d899093fb43c207c4e5_crop_north.jpg?1577720957&w=3072&h=2048"))
        surati.add(Madrid_images("https://images.daznservices.com/di/library/GOAL/8f/62/sergio-ramos-real-madrid-inter-2020_ym5v8e4kf1go18hlm26wsuklk.jpg?t=-1806816459&quality=60&w=1200&h=800"))
        surati.add(Madrid_images("https://images.daznservices.com/di/library/GOAL/8f/b1/marcelo-real-madrid-la-liga-10202018_vrte4wwxcnd41d6u0wcz5jsa4.jpg?t=-101164496&quality=100"))
        surati.add(Madrid_images("https://e00-marca.uecdn.es/assets/multimedia/imagenes/2020/06/15/15922043877213.jpg"))
        surati.add(Madrid_images("https://images.daznservices.com/di/library/GOAL/4b/b8/toni-kroos-real-madrid-2019-20_cjnj2so4sy0x1nwsx78gbb4r6.jpg?t=-828134317&quality=100"))
        surati.add(Madrid_images("https://img.bleacherreport.net/img/images/photos/002/127/598/hi-res-157658925_crop_north.jpg?1359464116&w=3072&h=2048"))
        surati.add(Madrid_images("https://portugoal.net/images/Foreign-Stars-Managers/Figo-Madrid.jpeg"))
        surati.add(Madrid_images("https://www.carabinerpartners.com/wp-content/uploads/2019/01/RC3_cara_casestudy_01.jpg"))
        surati.add(Madrid_images("https://soccergator.io/wp-content/uploads/post-media/Best%20La%20Liga%20Strikers/Ronaldo-Lui%CC%81s-Naza%CC%81rio.jpeg"))
        surati.add(Madrid_images("https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/57971cf063ac4a7bdc000001.jpg"))
        surati.add(Madrid_images("https://img2.thejournal.ie/article/2538313/river?version=2538333&width=1340"))
        surati.add(Madrid_images("https://editorial.uefa.com/resources/0253-0d800ac720cd-cc6fe0a24098-1000/506_iker_casillas_1999-_real_madrid_cf_.jpeg"))
        surati.add(Madrid_images("https://en.as.com/futbol/imagenes/2019/06/05/primera/1559763183_501954_1559763312_noticia_normal.jpg"))
        surati.add(Madrid_images("https://i0.wp.com/infinitemadrid.com/wp-content/uploads/2019/07/Bild945.jpg?fit=1920%2C1080&ssl=1"))



        val adapter = MadridAdapter(surati)

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter
    }
}