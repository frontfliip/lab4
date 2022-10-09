# More OOP

Sample project for Lab More OOP at the Object-oriented programming course at Ukrainian Catholic University.

## Continuous Integration

The workflow is `ci.yaml` file in the `.github/workflows` directory of this repository.

This workflow performs the following steps:

1. The `checkout` step downloads a copy of your repository on the runner.
1. The `setup-java` step configures the Java 11 JDK by Adoptium.
1. The "Build with Maven" step runs the Maven package target in non-interactive mode to ensure that your code builds, tests pass, and a package can be created.

## Task
Implement the heroes game in text mode
- class lotr.Character 
  - attributes: int power, in hp
  - methods: void kick(lotr.Character c), boolean isAlive()
- class lotr.Hobbit 
  - attributes: int power=0, int hp=3
  - methods: void kick(lotr.Character c) { toCry() }
- class lotr.Elf 
   - attributes: int power=10, int hp=10
   - methods: void kick(lotr.Character c) { kill everybody weaker than him, otherwise decrease the power of character by 1 }
- class lotr.King 
   - attributes: int power=from 5 to 15, int hp=from 5 to 15 
   - methods: void kick(lotr.Character c) { decrease number of hp of the enemy by random number which will be in the range of his power }
- class lotr.Knight 
   - attributes: int power=from 2 to 12, int hp=from 2 to 12
   - methods: void kick(lotr.Character c) { like lotr.King }
- class lotr.CharacterFactory 
   - methods: lotr.Character createCharacter() { returns random instance of any existing character } 
- class lotr.GameManager
   - methods: void fight(lotr.Character c1, lotr.Character c2) { to provide fight between to characters and explain via command line what happens during fight, till both of the characters are alive } 