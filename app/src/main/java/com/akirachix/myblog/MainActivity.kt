package com.akirachix.myblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayAuthors()
    }

    fun displayAuthors(){
        val author1 = Authors("The Shangai Secret","","Vanessa Landi","","2014","Hanif Abdurraqib's latest book is a transcendent feat of poetry, memoir, and—well, magic. His narration is as breathless and beautiful as his prose. It's an ode to his hometown of Columbus, Ohio; a love letter to basketball; a meditation on home and belonging; and an exploration of faith, Blackness, music, and place.","Read more")
        val author2 = Authors("48laws","","Robert Greene","","1990","In order to cultivate relationships that increase their power, people seeking power should force others to come to them, never allow others to become independent of them, avoid anyone who frequently encounters misfortune, never place too much trust in any one person, and never outperform their superiors.","Read more")
        val author3 = Authors("48laws","","Robert Greene","","1990","In order to cultivate relationships that increase their power, people seeking power should force others to come to them, never allow others to become independent of them, avoid anyone who frequently encounters misfortune, never place too much trust in any one person, and never outperform their superiors.","Read more")

        val authorList = listOf(author1,author2,author3)
        val authorsAdapter = AuthorsAdapter(authorList)
        binding.rvBlogs.adapter = authorsAdapter
    }
}