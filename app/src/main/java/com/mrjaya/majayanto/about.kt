package com.mrjaya.majayanto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView



class about : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgGit = findViewById<ImageView>(R.id.img_github)
        val imgLinkedIn = findViewById<ImageView>(R.id.img_linkedin)
        imgGit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/MochArisandiJayanto")
            startActivity(intent)
        }
        imgLinkedIn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("")
            startActivity(intent)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

}