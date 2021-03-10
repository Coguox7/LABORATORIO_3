package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class NoticiasAdaptador(private var listener: NoticiasHolder):
    RecyclerView.Adapter<NoticiasAdaptador.NoticiasHolder>() {
    private var noticias: MutableList<Noticia> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_noticia,parent, false)
        return NoticiasHolder(view)
    }

    override fun onBindViewHolder(holder: NoticiasHolder, position: Int) {
        val actual: Noticia = this.noticias[position]
        holder.bind(noticias)
    }

    override fun getItemCount(): Int {
        return  this.noticias.size
    }

    class NoticiasHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(noticia: Noticia, listener: ClickListener) = with(itemView){
           val txtTitulo: TextView = findViewById(R.id.txtTitulo)
            txtTitulo.text = noticia.titulo
            val imagen: ImageView = findViewById(R.id.imagen)
            Picasso.get().load(noticia.imagen).into(imagen);

            val txtTitulo2: TextView = findViewById(R.id.txtTitulo2)
            txtTitulo.text = noticia.titulo
            val imagen2: ImageView = findViewById(R.id.imagen2)
            Picasso.get().load(noticia.imagen).into(imagen);

            setOnClickListener{
                listener.onItemLongClicked(adapterPosition)
            }

            setOnLongClickListener{
                listener.onItemLongClicked(adapterPosition)
            }

        }

        interface ClickListener{
            fun onItemClicked(position: Int)
            fun onItemLongClicked(position: Int): Boolean
        }



    }
}