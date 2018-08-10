package com.example.logonrmlocal.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.logonrmlocal.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        rvPokemon.adapter = ListaPokemonAdapter(
                listaPokemons(),
                this, {
            Toast.makeText(this,
                    it.nome, Toast.LENGTH_LONG).show()
        })
        val layoutManager = LinearLayoutManager(this)
        rvPokemon.layoutManager = layoutManager
    }

    private fun listaPokemons(): List<Pokemon> {
        return listOf(
                getDragonite(),
                getDragonite(),
                getDragonite(),
                getDragonite(),
                getDragonite()
        )
    }

    private fun getDragonite(): Pokemon {
        return Pokemon(149, "Dragonite", "Genetic",
                "Bla bla bla",
                ContextCompat.getDrawable(this, R.drawable.dragonite149)!!)
    }
}
