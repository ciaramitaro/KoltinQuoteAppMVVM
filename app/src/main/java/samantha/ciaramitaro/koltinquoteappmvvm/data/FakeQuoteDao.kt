package samantha.ciaramitaro.koltinquoteappmvvm.data

import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()
    
    init {
        //This connects the list to the observable data holder class
        quotes.value = quoteList
    }
    fun addQuote(quote: Quote){
        quoteList.add(quote)
        //This updates the obersvable
        quotes.value = quoteList
    }
}