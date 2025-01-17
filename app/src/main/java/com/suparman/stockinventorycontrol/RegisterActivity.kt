package com.suparman.stockinventorycontrol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register) // Pastikan layout ini benar

        val edtFullName = findViewById<EditText>(R.id.edt_fullname)
        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtPassword = findViewById<EditText>(R.id.edt_password)
        val edtConfirmPassword = findViewById<EditText>(R.id.edt_konf_password)
        val btnRegister = findViewById<Button>(R.id.R_btn_1)

        btnRegister.setOnClickListener {
            val fullName = edtFullName.text.toString()
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            val confirmPassword = edtConfirmPassword.text.toString()

            if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Isi Semua Kolom", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Passwords Tidak Sesuai", Toast.LENGTH_SHORT).show()
            } else {
                // Lakukan proses registrasi disini
                Toast.makeText(this, "Registrasi Sukses", Toast.LENGTH_SHORT).show()
                // Contoh: Kembali ke LoginActivity
                finish()
            }
        }

        // Handle "Masuk" click
        val txtMasuk = findViewById<TextView>(R.id.R_txt_masuk)
        txtMasuk.setOnClickListener {
            // Navigate to LoginActivity
            navigateToLoginActivity()
        }
    }
    // Fungsi untuk berpindah ke LoginActivity
    private fun navigateToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}