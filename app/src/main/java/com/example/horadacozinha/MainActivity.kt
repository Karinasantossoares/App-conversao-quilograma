package com.example.horadacozinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horadacozinha.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener {
            binding.tvValorConvertido.text = converterMassa() }
    }

    private fun converterMassa(): String {
        val valorDig = binding.etValor.text.toString()
        val valor = valorDig.toDouble()
        val opcaoRadioButon = binding.tipOptions.checkedRadioButtonId
        val medidaEscolhida = opcaoRadioButon
        return (if (medidaEscolhida == R.id.rb_miligrama) {
            valor * 1000000
        } else if (medidaEscolhida == R.id.rb_grama) {
            valor * 1000
        } else {
            valor / 1000
        }).toString()

    }




}