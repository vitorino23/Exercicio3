package cesario.vitor.exercicio3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercicio3.*

class Exercicio3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio3)

        btCalcular.setOnClickListener {
            val nome = etNome.text
            val nota1 = etNota1.text.toString().toDouble()
            val nota2= etNota2.text.toString().toDouble()
            val nota3 = etNota3.text.toString().toDouble()
            var media = (nota1 + nota2 + nota3) / 3
            tvMedia.text = media.toString()
            if (media > 5){
                tvSituacao.text = "APROVADO"
            } else{
                tvSituacao.text = "REPROVADO"
            }
        }
    }
}
