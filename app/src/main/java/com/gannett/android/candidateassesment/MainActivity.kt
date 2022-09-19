package com.gannett.android.candidateassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gannett.android.candidateassesment.features.books.BookListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, BookListFragment.newInstance())
            .commitNow()
    }

}
