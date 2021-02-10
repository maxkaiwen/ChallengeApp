class Challenger(challenges:Collection<Challenge>) {

    var questionCorrect=question(challenges)
    private fun question(challenges:Collection<Challenge>): Boolean{
        var correctAnswer=0
        var percent=0.0F
        if (challenges.isEmpty()) {
            print("Empty list")
            return false
        }
        for (i in challenges){
            if(i.correct)
                correctAnswer++

        }
        percent= (correctAnswer/challenges.size.toFloat())
        print(percent)
        return percent>=.6



    }

}



