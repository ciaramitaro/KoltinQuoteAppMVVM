package samantha.ciaramitaro.koltinquoteappmvvm.data
//Creating Java style Singleton class
class FakeDatabase private constructor(){

    //holder of all objects
    val quoteDao = FakeDatabase()

//Singleton instantiation
    companion object{

        //Volatile makes it accessible by other threads.
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance()=
            //If the instance is not null, it will return the current instance being checked,
            //if it is null then we'll return a new FakeDatabase instance (not the null)
                instance ?: synchronized(this){
                    instance?: FakeDatabase().also { instance = it }
                }
    }

}