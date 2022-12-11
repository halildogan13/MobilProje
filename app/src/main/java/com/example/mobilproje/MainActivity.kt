package com.example.mobilproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilproje.databinding.ActivityMainBinding
import com.example.mobilproje.databinding.GameRowBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: GameRowBinding
    //private lateinit var gameList: ArrayList<Game>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        // Get the FragmentManager and start a transaction.
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Add the fragment to the container.
        val fragment = Games()
        fragmentTransaction.add(R.id.framelayout, fragment)

        // Commit the transaction.
        fragmentTransaction.commit()

        /*
        gameList = ArrayList<Game>()

        val game = Game("GTA V", "96", "Action")
        gameList.add(game)

        val gameAdapter = GameAdapter(gameList)
        binding*/


    }

    fun games(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val games = Games()
        fragmentTransaction.replace(R.id.framelayout,games).commit()
    }

    fun favorites(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val favorites = Favorites()
        fragmentTransaction.replace(R.id.framelayout,favorites).commit()
    }


}