package edu.farmingdale.alrajab.bcs421

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class UsersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        var userFirstname = findViewById<EditText>(R.id.etfirstName)
        var userLastname = findViewById<EditText>(R.id.etlastName)
        var reading = findViewById<Button>(R.id.readButton)
        var saving = findViewById<Button>(R.id.saveButton)
        var update = findViewById<Button>(R.id.updateButton)
        val sharedPreference =  getSharedPreferences("USERPREFERENCE", Context.MODE_PRIVATE)
        saving.setOnClickListener{
            if (userFirstname.text.toString().isEmpty().not() || userLastname.text.toString().isEmpty().not())
            {
                var editor = sharedPreference.edit()
                editor.putString("firstname",userFirstname.text.toString())
                editor.putString("lastname",userLastname.text.toString())
                editor.commit()
                userFirstname.setText("")
                userLastname.setText("")
                Toast.makeText(this,"Submitted successfully",Toast.LENGTH_SHORT).show()

            }else{Toast.makeText(this,"Fill the required fields please",Toast.LENGTH_SHORT).show()}
        }

        reading.setOnClickListener{
            val firstname =sharedPreference.getString("firstname","")
            userFirstname.setText(firstname)
            val lastname =sharedPreference.getString("lastname","")
            userLastname.setText(lastname)

        }
        update.setOnClickListener{
            if (userFirstname.text.toString().isEmpty().not() || userLastname.text.toString().isEmpty().not())
            {
                var editor = sharedPreference.edit()
                editor.putString("firstname",userFirstname.text.toString())
                editor.putString("lastname",userLastname.text.toString())
                editor.commit()
                userFirstname.setText("")
                userLastname.setText("")
                Toast.makeText(this,"Submitted successfully",Toast.LENGTH_SHORT).show()

            }else{Toast.makeText(this,"Fill the required fields please",Toast.LENGTH_SHORT).show()}
        }
    }
}