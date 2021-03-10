package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var noticias: MutableList<Noticia> = mutableListOf()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noticias.add(Noticia("NOTICIA 1", "https://www.latercera.com/resizer/HKVLk06vadtn6cFlo-L9mL1spv0=/900x600/smart/cloudfront-us-east-1.images.arcpublishing.com/copesa/6KHHKDM3ONGO7N4PVRVPVKJQ44.jpg"))
        noticias.add(Noticia("NOTICIA 2", "https://i.ytimg.com/vi/r-nwEEIvPXg/maxresdefault.jpg"))

        val adaptador: NoticiasAdaptador = NoticiasAdaptador(noticias)


        val listaNoticias: RecyclerView = findViewById(R.id.listaNoticias)
        listaNoticias.layoutManager = LinearLayoutManager(this)
        listaNoticias.adapter = adaptador

        val listaNoticias2: RecyclerView = findViewById(R.id.listaNoticias)
        listaNoticias2.layoutManager = LinearLayoutManager(this)
        listaNoticias2.adapter = adaptador

    }
}