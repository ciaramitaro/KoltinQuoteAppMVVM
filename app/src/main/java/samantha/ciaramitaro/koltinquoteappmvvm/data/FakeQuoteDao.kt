package samantha.ciaramitaro.koltinquoteappmvvm.data

import androidx.lifecycle.LiveData
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
        //This updates the observable value with updated list
        //which will trigger all the observers of this mutableLive Data of List holding type Quote
        quotes.value = quoteList
    }
    //Casting quotes to be LiveData because we don't want it to be mutable outside DAO class
    fun getQuote()= quotes as LiveData<List<Quote>>
}