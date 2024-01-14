package bot
import java.util.Scanner

/*
Description
Now you will teach your bot to count. It's going to become an expert in numbers!

Objective
In this stage, you will program the bot to count from 0 to any positive number users enter.

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: a dialogue with the new version of the bot

Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!
Note: each number starts with a new line, and after a number, the bot should print the exclamation mark.
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

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val (remainder3, remainder5, remainder7) = List(3) { scanner.nextInt() }
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    val number = scanner.nextInt()
    (0..number).forEach { println("$it!") }

    println("Completed, have a nice day!")
}