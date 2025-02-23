fun main(){
    var userPoint : Int = 0;
    var computerPoint : Int = 0;

    while (true){
        println("enter your choise: ")
        println("1. rock")
        println("2. paper")
        println("3. scissors")
        println("4. Exit")
        // userchoice id to make the input from user and store his choice
        val userChoice = readln().toInt()

        if (userChoice == 4) {
            println("Exit the game...")
            if(userPoint > computerPoint){
                println("User Wins the game")
            } else if(userPoint < computerPoint){
                println("Computer Wins the game")
            } else {
                println("Match is tie between computer and user")
            }
            break
        }
        if (userChoice !in 1 .. 3){
            println("Invalid choice. please enter the number between 1 and 3.")
            continue
        }
        val computerChoice = (1 ..3).random()
        println("you chose: ${userChoice}")
        println("computer Chose:  ${computerChoice}")

        val result = getwinner(userChoice, computerChoice)
        if(result == "user wins"){
            println("User Point: $userPoint")
            userPoint = userPoint + 1
        } else if(result == "computer wins"){
            println("Computer Point: $computerPoint")
            computerPoint = computerPoint + 1
        } else {
            println()
        }

    }
}

fun getwinner(userChoice: Int, computerChoice: Int): String {

    if (userChoice == computerChoice){
        return "Draw"
    }
    if((userChoice == 1 && computerChoice == 3)
        ||(userChoice == 2 && computerChoice == 1)
        ||(userChoice == 3 && computerChoice == 2)){
        return "user wins"

    } else{
        return "computer wins"
    }

}