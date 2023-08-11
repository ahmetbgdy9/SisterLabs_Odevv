package com.example.odevv.hafta4.odev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.odevv.R

class RehberActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextPhone: EditText
    private lateinit var buttonSave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rehber)

        editTextName = findViewById(R.id.editTextName)
        editTextPhone = findViewById(R.id.editTextPhone)
        buttonSave = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val name = editTextName.text.toString()
            val phone = editTextPhone.text.toString()

            if (name.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Lütfen boş alanları doldurun.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Sayfa2::class.java)
                startActivity(intent)
            }
        }
    }
}