package com.mrjaya.majayanto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar


class detaill : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_objek)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val tvSetIden: TextView = findViewById(R.id.tv_set_identity)
        val tvOverview: TextView = findViewById(R.id.tv_set_overview)
        val tvRank: TextView = findViewById(R.id.tv_item_rank)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tIden = intent.getStringExtra(EXTRA_IDENTITY)
        val tOverview = intent.getStringExtra(EXTRA_OVERVIEW)
        val tRank = intent.getStringExtra(EXTRA_RANK)

        tvSetName.text = tName
        tvSetIden.text = tIden
        tvOverview.text = tOverview
        tvRank.text = tRank
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_IDENTITY = "extra_identity"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_RANK = "extra_rank"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}