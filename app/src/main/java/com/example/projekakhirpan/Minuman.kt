package com.example.projekakhirpan

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import java.util.*

class Minuman : AppCompatActivity() {
    private lateinit var rvItems: RecyclerView
    private var title = "Minuman"
    private val list = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minuman)
        setActionBarTitle(title)

        rvItems = findViewById(R.id.rv_items)
        rvItems.setHasFixedSize(true)

        list.addAll(ItemData.listDataMinuman)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvItems.layoutManager = LinearLayoutManager(this)
        val listItemAdapter = ListItemAdapter(list)
        rvItems.adapter = listItemAdapter

        listItemAdapter.setOnItemClickCallback(object : ListItemAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Item) {
                showSelectedItems(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvItems.layoutManager = GridLayoutManager(this, 2)
        val gridItemAdapter = GridItemAdapter(list)
        rvItems.adapter = gridItemAdapter

        gridItemAdapter.setOnItemClickCallback(object : GridItemAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Item) {
                showSelectedItems(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvItems.layoutManager = LinearLayoutManager(this)
        val cardViewItemAdapter = CardViewItemAdapter(list)
        rvItems.adapter = cardViewItemAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showSelectedItems(item: Item) {
        Toast.makeText(this, "Kamu memilih " + item.name, Toast.LENGTH_SHORT).show()
    }
}