package com.gannett.android.candidateassesment.features.books

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gannett.android.candidateassesment.R

//TODO: Display a list of books

class BookListFragment : Fragment(R.layout.book_list_fragment) {

    private lateinit var recyclerView: RecyclerView

    companion object {
        fun newInstance(): BookListFragment {
            return BookListFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.book_list_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.setHasFixedSize(true)
    }
}
