package com.suparman.stockinventorycontrol

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class supplierActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_supplier) // Ensure this layout is correct

        val mainView = findViewById<View>(R.id.list_supplier) // Ensure this ID is correct
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        } else {
            // Handle the case where the view is null
            Log.e("LoginActivity", "View with ID 'main' not found")
        }

        // Handle "Masuk" click
        val txtMasuk = findViewById<TextView>(R.id.daftar)
        txtMasuk.setOnClickListener {
            // Navigate to RegisterActivity
            navigateToRegisterActivity()
        }

        // Handle "Register" button click
        val buttonMenu = findViewById<Button>(R.id.R_btn_1)
        buttonMenu.setOnClickListener {
            navigateToMenuActivity()
        }
    }

    // Function to navigate to RegisterActivity
    private fun navigateToRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    // Function to navigate to MenuActivity
    private fun navigateToMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}