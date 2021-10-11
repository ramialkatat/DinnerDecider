package com.example.dinnerdecider

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val selectedFoodTxt= findViewById<TextView>(R.id.selectedFoodTxt)
        selectedFoodTxt.text="Burger King" //Setting the text into a default value

        //Creating an array list of Types of food
        val foodList= arrayListOf("Chinese Noodles","Hamburger","McDonalds","Barros Pizza")
       val decideBtn=findViewById<Button>(R.id.decideBtn)
        decideBtn.setOnClickListener{
            val random= Random()
            val randomFood=random.nextInt(foodList.count()) //We are creating  a number that is randomly generated and it's going to be between 0 and the maximum number of elements in the arrayList
            selectedFoodTxt.text=foodList[randomFood] //it returns the element at the generated random index
        }

        val addFoodBtn=findViewById<Button>(R.id.addFoodBtn)
        addFoodBtn.setOnClickListener{
            foodList.add(addFoodTxt.text.toString()) //adding new food to the list
            addFoodTxt.text.clear() //after each press we clear out the text inside the addFoodTxt
            println(foodList)
        }
    }
}