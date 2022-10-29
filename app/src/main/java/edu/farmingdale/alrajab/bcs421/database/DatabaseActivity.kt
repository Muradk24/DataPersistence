package edu.farmingdale.alrajab.bcs421.database

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import edu.farmingdale.alrajab.bcs421.databinding.ActivityDatabaseBinding
import kotlin.random.Random

class DatabaseActivity : AppCompatActivity() {

    private lateinit var binding:  ActivityDatabaseBinding

    private lateinit var dbHelper:NameRepository

    // ToDO: Database link to be completed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatabaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbHelper= NameRepository.getInstance(this)

        binding.readData.setOnClickListener { readData() }
        binding.writeData.setOnClickListener { writeData() }
        binding.updateButtonn.setOnClickListener{updateData()}


    }
    private fun updateData(){
        if (binding.etfirstNamedb.text.toString().isEmpty().not() && binding.etlastNamedb.text.toString().isEmpty().not())

        {
            dbHelper.updateUser(User(1,binding.etfirstNamedb.text.toString(),
                binding.etlastNamedb.text.toString()))
            binding.etfirstNamedb.setText("")
            binding.etlastNamedb.setText("")
            Toast.makeText(this,"Entered Successfully",Toast.LENGTH_SHORT).show()
        }else{Toast.makeText(this,"Please fill in all fields please",Toast.LENGTH_SHORT).show()}


    }


    private fun writeData() {

        if (binding.etfirstNamedb.text.toString().isEmpty().not() && binding.etlastNamedb.text.toString().isEmpty().not())

        {
            dbHelper.addUser(User(binding.etfirstNamedb.text.toString(),
                binding.etlastNamedb.text.toString()))
            binding.etfirstNamedb.setText("")
            binding.etlastNamedb.setText("")
            Toast.makeText(this,"Entered Successfully",Toast.LENGTH_SHORT).show()
        }else{Toast.makeText(this,"Please fill in all fields please",Toast.LENGTH_SHORT).show()}

    }

    private fun readData() {
        dbHelper.getAll().forEach { Log.d("Data",it.firstName+" , "+ it.lastName) }


    }

}