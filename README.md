# PigGame
Pig Game code
Task: Write a program that plays the dice game. Here are some things to keep in mind before you start developing the program:

Input: The input consists of one string value: the player's choice wheater to hold the round or to keep rolling the die. Output: The program will display the outcomes of all die rolls as well as the number of points awarded t oeach participant on each round.

Constraints: Assume that the input will always be either a " Y " ( representing a " Yes " ) or an " N " ( representing a " No " ). In addition, here are some more considerations to keep in mind when playing the game:

The game will have two players: the user and a computer player. This uses the same game setup as Machine Exercise 4.4 (Game : Rock , Paper , Scissors).
Simulating a die roll will be done withthe random.randint() function, which needs you to import the random module at the start of the program.This same technique will be also used for the computer player to make its " choice " wheter to continue with rolling the die(i.e,. by generating a 0).
The user will always be the first player of the game.
DThe application declares and initializes variables for the user's and computer's scores before creating the Scanner object to take user input.
We utilized the Random class to make the computer's decision random.
We used System.out.print to produce a welcome message.
After the user rolls the die, the computer selects one at random. The game's rules are then applied by the computer to determine the round's winner.
After each round is complete, the program prints the final results and asks the user if they want to keep playing.
