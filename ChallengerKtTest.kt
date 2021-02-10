import org.junit.Assert.*
import org.junit.Test

class ChallengerKtTest{

    @Test
    fun testChallenge(){
        val questions= listOf<Challenge>(

            Challenge("3","5",true), Challenge("3","5",true), Challenge("3","5",true)
        , Challenge("3","5",false)
        )
        val result =Challenger(questions).questionCorrect


        assertTrue(result)


    }
}