package com.ourminigame.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ourminigame.tictactoe.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_start)



        binding.start.setOnClickListener {

            var player1= binding.player1.text.trim().toString()
            var player2=binding.player2.text.trim().toString()

            if (player1.isEmpty() || player2.isEmpty()){

                Toast.makeText(this, "Enter players name", Toast.LENGTH_SHORT).show()

            }
            else {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("cross", player1)
                intent.putExtra("zero", player2)

                startActivity(intent)
            }

        }


    }

    override fun onBackPressed() {
        finishAffinity()
    }
}