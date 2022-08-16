package br.com.afirmacoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.afirmacoes.adapter.ItemAdapter
import br.com.afirmacoes.data.DataSource
import br.com.afirmacoes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        val myDataset = DataSource().carregaAfirmacoes()
        val rv = binding.recyclerView
        rv.adapter = ItemAdapter(this,myDataset)
        rv.setHasFixedSize(true)

        setContentView(binding.root)
    }
}