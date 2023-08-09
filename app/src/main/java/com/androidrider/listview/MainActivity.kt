package com.androidrider.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.androidrider.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var adapter: ArrayAdapter<*>

    val data = arrayListOf<String>("Apple","Banana","Orange","Papaya","Lemon","Mango","Grapes","strawberry","Orange","Papaya","Apple","Banana","Lemon","Mango")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnListView.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }

        //simple lisView
        val listView = binding.listView

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val itemAtPos = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Clicked on $itemAtPos", Toast.LENGTH_LONG).show()
        }

    }
}