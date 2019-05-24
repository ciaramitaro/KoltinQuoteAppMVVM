package samantha.ciaramitaro.koltinquoteappmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import samantha.ciaramitaro.koltinquoteappmvvm.data.Quote
import samantha.ciaramitaro.koltinquoteappmvvm.data.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel (private val quoteRepository: QuoteRepository) : ViewModel() {
    //getting from repository because it is the logical layer between database & viewModel
    fun getQuotes()= quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}