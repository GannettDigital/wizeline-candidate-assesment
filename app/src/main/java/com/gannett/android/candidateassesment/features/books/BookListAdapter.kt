package com.gannett.android.candidateassesment.features.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gannett.android.candidateassesment.R
import com.gannett.android.candidateassesment.local.BookEntity

class BookListAdapter : RecyclerView.Adapter<BookListAdapter.BookViewHolder>() {

    lateinit var books: List<BookEntity>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.book_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.title.text = books[position].title
        holder.genre.text = books[position].genre
    }

    override fun getItemCount(): Int = books.size

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.book_title)
        val genre: TextView = view.findViewById(R.id.book_genre)
    }
}
