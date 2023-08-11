package com.androidrider.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.SearchView

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: ListViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        setSupportActionBar(findViewById(R.id.lv_toolbar))

        val listview = findViewById<ListView>(R.id.listView)

        adapter = ListViewAdapter(this, R.layout.custom_list, Constant.getData())
        listview.adapter = adapter

        // Set On Click Listener method called
        setOnClickListener()
    }

    // Set On Click Listener Function
    fun setOnClickListener(){
        val listView = findViewById<ListView>(R.id.listView)
        listView.setOnItemClickListener() { adapterView, view, position, id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(this,"Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        val search = menu.findItem(R.id.action_search)
        val searchView = search.actionView as SearchView
        searchView.queryHint = "Search"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }

}