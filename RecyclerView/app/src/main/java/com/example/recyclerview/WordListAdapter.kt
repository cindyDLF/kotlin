package com.example.recyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import java.util.*
import android.view.LayoutInflater

class WordListAdapter(val mWordList : ArrayList<String>) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder?.wordItemView?.text = mWordList.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListAdapter.WordViewHolder {
        return WordViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.wordlist_item, parent, false))
    }

    override fun getItemCount(): Int {
        return mWordList?.size
    }

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val wordItemView = itemView.findViewById<TextView>(R.id.word)
    }
}