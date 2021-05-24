# RockScissorsPaper
Simple rock-scissors-paper game to play in the console, made in java without using any frameworks.
Object-Oriented Programming design has been followed when developing.
For the unit testing Junit5 and assertj are used.

### Configuration
In the `App.class` we can configure two parameters (they are on the top as constants).
First parameter will be the name of the Bot.
Second parameter is the number of rounds we want to play.
NOTE: In the second parameter only natural numbers will be accepted (1,2,3,4,5 ...). 

### Running the game
Open a bash in the `RockScissorsPaper` main folder and run the game by using the command:
 `mvn exec:java -Dexec.mainClass=org.pcremades.App`
 
##### Step 1
The game will ask for your name and you will have to write it and press Enter.
##### Step 2
You will have to write what you want to play: rock, scissors or paper.
Write it properly or the game is going to be asking for your choice until you do.
Then a random choice will be generated for the other player and we will see the winner of the round
in the console.

This process will repeat as many rounds as the game is configured.
##### Step 3
Finally, the game will count how many wins the players have and it will print the final winner in the console.
After this the game will end.