package com.mrjaya.majayanto

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListObjek(val listObjek: ArrayList<ObjekIsi>) : RecyclerView.Adapter<ListObjek.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_objek, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listObjek.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rank, photo, overview, identity) = listObjek[position]


        holder.tvName.text = name
        holder.tvRank.text = rank

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detaill::class.java)
            moveDetail.putExtra(detaill.EXTRA_RANK, rank)
            moveDetail.putExtra(detaill.EXTRA_NAME, name)
            moveDetail.putExtra(detaill.EXTRA_PHOTO, photo)
            moveDetail.putExtra(detaill.EXTRA_IDENTITY, identity)
            moveDetail.putExtra(detaill.EXTRA_OVERVIEW, overview)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRank: TextView = itemView.findViewById(R.id.tv_item_rank)
    }

}