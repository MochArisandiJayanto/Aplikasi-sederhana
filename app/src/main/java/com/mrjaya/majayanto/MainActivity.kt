package com.mrjaya.majayanto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvObjekIsi: RecyclerView
    private var list: ArrayList<ObjekIsi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvObjekIsi = findViewById(R.id.rv_univ)
        rvObjekIsi.setHasFixedSize(true)

        list.addAll(ObjekData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvObjekIsi.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = ListObjek(list)
        rvObjekIsi.adapter = listUnivAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_optional, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity, about::class.java)
                startActivity(iAbout)
            }
        }
    }
}