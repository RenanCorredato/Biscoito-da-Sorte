package br.com.renan.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minhaLista = arrayListOf("A vida trará coisas boas se tiver paciência.",
            "Não compense na ira o que lhe falta na razão.",
            "Não há que ser forte.","Uma bela flor é incompleta sem as suas folhas.",
            "Sem o fogo do entusiasmo, não há o calor da vitória.",
            "O riso é a menor distância entre duas pessoas.",
            "Os defeitos são mais fortes quando o amor é fraco.",
            "A sorte favorece a mente bem preparada.")



        btnMainNovaFrase.setOnClickListener {
            val random = Random
            val randomPrograma = random.nextInt(minhaLista.count())

            txvMainListaFrase.text = minhaLista [randomPrograma]


          btnMainSair.setOnClickListener {

              finishAffinity()

                }
            }
        }
    }
