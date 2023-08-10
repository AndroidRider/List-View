package com.androidrider.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.androidrider.listview.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding


    private val language = arrayOf<String>(
        "C", "C++", "Java", "Kotlin", ".Net", "Ruby", "Rails",
        "Python", "Java Script", "Php", "Ajax", "Perl", "Hadoop"
    )

    private val description = arrayOf<String>(
        // C
        "C is a general-purpose programming language that is extremely popular, simple, and flexible to use.",
        // C++
        "C++ is one of the world's most popular programming languages.",
        // Java
        "Java is a widely-used programming language for coding web applications.",
        // Kotlin
        "Kotlin is a new open source programming language like Java, JavaScript, Python etc.",
        // .Net
        "The .NET Framework is a proprietary software framework developed by Microsoft that runs primarily on Microsoft Windows.",
        // Ruby
        "A dynamic, open source programming language with a focus on simplicity and productivity.",
        // Rails
        "A Ruby on Rails developer is responsible for writing server-side web application logic in Ruby, around the framework Rails.",
        // Python
        "Python is an interpreted, object-oriented, high-level programming language with dynamic semantics.",
        // Java Script
        "JavaScript is the Programming Language for the Web.\nJavaScript can update and change both HTML and CSS.\nJavaScript can calculate, manipulate and validate data.",
        // PHP
        "PHP is an acronym for \"PHP: Hypertext Preprocessor\nPHP is a widely-used, open source scripting language\nPHP scripts are executed on the server\nPHP is free to download and use",
        // AJAX
        "AJAX = Asynchronous JavaScript And XML.\nAJAX is not a programming language.\nAJAX just uses a combination of:\nA browser built-in XMLHttpRequest object (to request data from a web server)\nJavaScript and HTML DOM (to display or use the data)",
        // Perl
        "Perl, a cross-platform open-source computer programming language used widely in the commercial and private computing sectors.",
        // Hadoop
        "Hadoop is an open source framework based on Java that manages the storage and processing of large amounts of data for applications."
    )

    private val imageId = arrayOf<Int>(
        R.drawable.c_logo,
        R.drawable.cplus_logo,
        R.drawable.java_logo,
        R.drawable.kotlin_logo,
        R.drawable.dot_net_logo,
        R.drawable.ruby_logo,
        R.drawable.rails_logo,
        R.drawable.python_logo,
        R.drawable.javascript_logo,
        R.drawable.php_logo,
        R.drawable.ajax_logo,
        R.drawable.perl_logo,
        R.drawable.hadoop_logo
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.materialToolbar.setTitle("ListView")

        val listView = binding.listView

        val myListAdapter = MyListAdapter(this, language, description, imageId)
        listView.adapter = myListAdapter

        // Set On Click Listener
        listView.setOnItemClickListener() { adapterView, view, position, id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(
                this,
                "Click on item at $itemAtPos its item id $itemIdAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.search -> Toast.makeText(this,"About Selected",Toast.LENGTH_SHORT).show()
            R.id.list -> Toast.makeText(this,"Settings Selected",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}