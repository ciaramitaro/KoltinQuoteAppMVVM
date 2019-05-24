package samantha.ciaramitaro.koltinquoteappmvvm.utilities

import samantha.ciaramitaro.koltinquoteappmvvm.data.FakeDatabase
import samantha.ciaramitaro.koltinquoteappmvvm.data.QuoteRepository
import samantha.ciaramitaro.koltinquoteappmvvm.ui.quotes.QuotesViewModelFactory

//This singleton doesn't need to be passed anything which is why it's an object and not a class.
object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}