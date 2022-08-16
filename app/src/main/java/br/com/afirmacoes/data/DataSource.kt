package br.com.afirmacoes.data

import br.com.afirmacoes.R
import br.com.afirmacoes.model.Afirmacao

class DataSource {

    fun carregaAfirmacoes(): List<Afirmacao> {
        return listOf<Afirmacao>(
            Afirmacao(R.string.affirmation1, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation2, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation3, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation4, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation5, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation6, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation7, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation8, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation9, R.drawable.ic_launcher_background),
            Afirmacao(R.string.affirmation10, R.drawable.ic_launcher_background)
        )
    }
}