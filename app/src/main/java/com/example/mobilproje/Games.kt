package com.example.mobilproje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.concurrent.fixedRateTimer


class Games : Fragment() {

    private lateinit var adapter: GameAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var gameList: ArrayList<Game>

    lateinit var gameImageIds : ArrayList<Int>
    lateinit var gameNames: ArrayList<String>
    lateinit var metacriticPoints: ArrayList<String>
    lateinit var gameTypes: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = GameAdapter(gameList)
        recyclerView.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.games, container, false)
    }

    private fun dataInitialize(){
        gameList = arrayListOf<Game>()

        gameImageIds = arrayListOf(
            R.drawable.gtav
        )

        gameNames = arrayListOf(
            getString(R.string.gamename_1)
        )
        gameTypes = arrayListOf(
            getString(R.string.gametype_1)
        )
        metacriticPoints = arrayListOf(
            getString(R.string.mtpoint_1)
        )

        for (i in gameImageIds.indices){
            val game = Game(gameNames[i],metacriticPoints[i],gameTypes[i],gameImageIds[i])
            gameList.add(game)
        }

    }



}