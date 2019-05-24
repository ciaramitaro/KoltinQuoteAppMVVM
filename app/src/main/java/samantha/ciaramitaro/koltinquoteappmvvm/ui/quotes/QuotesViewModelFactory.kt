package samantha.ciaramitaro.koltinquoteappmvvm.ui.quotes


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import samantha.ciaramitaro.koltinquoteappmvvm.data.QuoteRepository

//To prevent recreation during orentation changes ViewModel gets views from ViewModelProvider.
@Suppress("UNCHECKED_CAST")
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory() {
    override fun <T: ViewModel?> create(modelClass: Class<T>) : T{
        return  QuotesViewModel(quoteRepository) as T
    }
}
