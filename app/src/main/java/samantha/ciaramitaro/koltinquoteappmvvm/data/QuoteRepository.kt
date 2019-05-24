package samantha.ciaramitaro.koltinquoteappmvvm.data

//WHERE LOGIC GOES between databases and ViewModels!!!
//We are doing dependency injections instead of creating them in the objects
//to make everything more modular
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao){

    fun addQuote(quote : Quote){
        quoteDao.addQuote(quote)
    }
    fun getQuotes()= quoteDao.getQuote()

    companion object{
        //Volatile makes it accessible by other threads.
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao)=
        //If the instance is not null, it will return the current instance being checked,
            //if it is null then we'll return a new FakeDatabase instance (not the null)
            instance ?: synchronized(this){
                instance?: QuoteRepository(quoteDao).also { instance = it }
            }
    }
}