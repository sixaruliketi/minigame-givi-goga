package com.ourminigame.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.ourminigame.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var backPressedTime: Long = 0
    private var backToast: Toast? = null

    var index = 0
    var one_cross = false
    var two_cross = false
    var three_cross = false
    var four_cross = false
    var five_cross = false
    var six_cross = false
    var seven_cross = false
    var eight_cross = false
    var nine_cross = false


    var one_zero = false
    var two_zero = false
    var three_zero = false
    var four_zero = false
    var five_zero = false
    var six_zero = false
    var seven_zero = false
    var eight_zero = false
    var nine_zero = false

    var cross = ""
    var zero = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        var intent = intent

        cross = intent.getStringExtra("cross").toString()
        zero = intent.getStringExtra("zero").toString()

        playerTurn()


        binding.one.setOnClickListener {

            if (index % 2 == 0) {
                binding.one.setImageResource(R.drawable.cross)
                one_cross = true
            } else {
                binding.one.setImageResource(R.drawable.zero)
                one_zero = true
            }

            binding.one.isEnabled = false
            index++

            crossWin()
            zeroWin()
            playerTurn()


        }

        binding.two.setOnClickListener {

            if (index % 2 == 0) {
                binding.two.setImageResource(R.drawable.cross)
                two_cross = true
            } else {
                binding.two.setImageResource(R.drawable.zero)
                two_zero = true
            }

            binding.two.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.three.setOnClickListener {

            if (index % 2 == 0) {
                binding.three.setImageResource(R.drawable.cross)
                three_cross = true
            } else {
                binding.three.setImageResource(R.drawable.zero)
                three_zero = true
            }

            binding.three.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.four.setOnClickListener {

            if (index % 2 == 0) {
                binding.four.setImageResource(R.drawable.cross)
                four_cross = true
            } else {
                binding.four.setImageResource(R.drawable.zero)
                four_zero = true
            }

            binding.four.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.five.setOnClickListener {

            if (index % 2 == 0) {
                binding.five.setImageResource(R.drawable.cross)
                five_cross = true
            } else {
                binding.five.setImageResource(R.drawable.zero)
                five_zero = true
            }

            binding.five.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.six.setOnClickListener {

            if (index % 2 == 0) {
                binding.six.setImageResource(R.drawable.cross)
                six_cross = true
            } else {
                binding.six.setImageResource(R.drawable.zero)
                six_zero = true
            }

            binding.six.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.seven.setOnClickListener {

            if (index % 2 == 0) {
                binding.seven.setImageResource(R.drawable.cross)
                seven_cross = true
            } else {
                binding.seven.setImageResource(R.drawable.zero)
                seven_zero = true
            }

            binding.seven.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.eight.setOnClickListener {

            if (index % 2 == 0) {
                binding.eight.setImageResource(R.drawable.cross)
                eight_cross = true
            } else {
                binding.eight.setImageResource(R.drawable.zero)
                eight_zero = true
            }

            binding.eight.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        binding.nine.setOnClickListener {

            if (index % 2 == 0) {
                binding.nine.setImageResource(R.drawable.cross)
                nine_cross = true
            } else {
                binding.nine.setImageResource(R.drawable.zero)
                nine_zero = true
            }

            binding.nine.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()


        }




        binding.reset.setOnClickListener {
            resetGame()
        }

        binding.exit.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setMessage("DO YOU WANT TO EXIT?")
            builder.setPositiveButton("YES") { dialog, which ->

                startActivity(Intent(this, StartActivity::class.java))
                finish()


                        }
            builder.setNegativeButton("NO"
            ) { dialog, which -> }
            val alertDialog = builder.create()

            alertDialog.show()




        }


    }

    private fun resetGame() {

        index = 0
        one_cross = false
        two_cross = false
        three_cross = false
        four_cross = false
        five_cross = false
        six_cross = false
        seven_cross = false
        eight_cross = false
        nine_cross = false


        one_zero = false
        two_zero = false
        three_zero = false
        four_zero = false
        five_zero = false
        six_zero = false
        seven_zero = false
        eight_zero = false
        nine_zero = false

        binding.one.isEnabled = true
        binding.two.isEnabled = true
        binding.three.isEnabled = true
        binding.four.isEnabled = true
        binding.five.isEnabled = true
        binding.six.isEnabled = true
        binding.seven.isEnabled = true
        binding.eight.isEnabled = true
        binding.nine.isEnabled = true

        binding.one.setImageDrawable(null)
        binding.two.setImageDrawable(null)
        binding.three.setImageDrawable(null)
        binding.four.setImageDrawable(null)
        binding.five.setImageDrawable(null)
        binding.six.setImageDrawable(null)
        binding.seven.setImageDrawable(null)
        binding.eight.setImageDrawable(null)
        binding.nine.setImageDrawable(null)

        playerTurn()

        binding.winner.visibility = View.GONE
        binding.player.visibility = View.VISIBLE


    }

    private fun gameOver() {

        binding.one.isEnabled = false
        binding.two.isEnabled = false
        binding.three.isEnabled = false
        binding.four.isEnabled = false
        binding.five.isEnabled = false
        binding.six.isEnabled = false
        binding.seven.isEnabled = false
        binding.eight.isEnabled = false
        binding.nine.isEnabled = false


    }

    private fun crossWin() {

        if ((one_cross && two_cross && three_cross) ||
            (four_cross && five_cross && six_cross) ||
            (seven_cross && eight_cross && nine_cross) ||
            (one_cross && five_cross && nine_cross) ||
            (three_cross && five_cross && seven_cross) ||
            (one_cross && four_cross && seven_cross) ||
            (two_cross && five_cross && eight_cross) ||
            (three_cross && six_cross && nine_cross)
        ) {

            gameOver()

            binding.winner.text = "Winner is $cross"
            binding.player.visibility = View.GONE
            binding.winner.visibility = View.VISIBLE


        }

    }

    private fun zeroWin() {

        if ((one_zero && two_zero && three_zero) ||
            (four_zero && five_zero && six_zero) ||
            (seven_zero && eight_zero && nine_zero) ||
            (one_zero && five_zero && nine_zero) ||
            (three_zero && five_zero && seven_zero) ||
            (one_zero && four_zero && seven_zero) ||
            (two_zero && five_zero && eight_zero) ||
            (three_zero && six_zero && nine_zero)
        ) {


            gameOver()

            binding.winner.text = "Winner is $zero"
            binding.player.visibility = View.GONE
            binding.winner.visibility = View.VISIBLE

        }

    }

    private fun playerTurn() {

        if (index % 2 == 0) {
            binding.player.text = "Turn of $cross"
        } else {
            binding.player.text = "Turn of $zero"
        }

    }

    override fun onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast?.cancel()
            finishAffinity()
        } else {
            backToast = Toast.makeText(baseContext, "Double press to Exit", Toast.LENGTH_SHORT)
            backToast?.show()
        }
        backPressedTime = System.currentTimeMillis()

    }
}