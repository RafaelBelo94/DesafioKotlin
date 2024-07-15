package com.example.minhalistasenai

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.minhalistasenai.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)


            binding.idBotaoCadastrar.setOnClickListener {
                startActivity(Intent(this, MainActivity2::class.java).apply {
                    putExtra("nome", binding.idNome.text.toString())
                    putExtra("descricao", binding.idDescricao.text.toString())
                    putExtra("valor", binding.idValor.text.toString())
                })

        }




}
}