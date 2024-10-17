package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // Declare a private member variable for the dice value and initialize it to 1
    private var diceValue: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the TextView and Button from the layout
        val diceValueText: TextView = findViewById(R.id.diceValueText)
        val rollButton: Button = findViewById(R.id.roll_dice)
        val addTwoButton: Button = findViewById(R.id.addTwoButton)

        // Set an onClickListener to the button
        rollButton.setOnClickListener {
            // Call rollDice() when the button is clicked
            rollDice(diceValueText)
        }

    }



    // Method to roll the dice and update the TextView
    private fun rollDice(diceValueText: TextView) {
        // Generate a random value from 1 to 6
        diceValue = Random.nextInt(1, 7)

        // Pass the generated value to the TextView to display it
        diceValueText.text = diceValue.toString()
    }


}