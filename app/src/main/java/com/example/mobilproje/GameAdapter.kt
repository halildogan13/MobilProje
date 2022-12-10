package com.example.mobilproje

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gameList: ArrayList<Game>) : RecyclerView.Adapter<GameAdapter.GameHolder>(){


    class GameHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gameImage : AppCompatImageView = itemView.findViewById(R.id.imageView)
        val gameName : TextView = itemView.findViewById(R.id.textView)
        val metacritic : TextView = itemView.findViewById(R.id.textView2)
        val gameType : TextView = itemView.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.game_row,parent,false)
        return GameHolder(itemView)
    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        val currentGame = gameList[position]
        holder.gameImage.setImageResource(currentGame.gameImage)
        holder.gameName.text = currentGame.name
        holder.metacritic.text = currentGame.metacriticPoint
        holder.gameType.text = currentGame.gameType

    }

    override fun getItemCount(): Int {
        return gameList.size
    }

}