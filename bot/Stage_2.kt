package bot
import java.util.Scanner

/*
Description
The greeting part is great, but chatbots are also supposed to interact with a user. It's time to implement this functionality.

Objective
In this stage, you will introduce yourself to the bot so that it can greet you by your name.

Your program should print the following lines:

Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
What a great name you have, {yourName}!
You may change the name and the creation year of your bot if you want.

Instead of {yourName}, the bot must print your name entered from the standard input.

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: a dialogue with the bot

Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max!
 */

private const val name = "Ellie"
private const val creationDate = 2024

fun main() {
    val scanner = Scanner(System.`in`)
    println("Hello! My name is $name.")
    println("I was created in $creationDate.")
    println("Please, remind me your name.")
    val userName = scanner.next()
    println("What a great name you have, $userName!")
}



