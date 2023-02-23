/*Create n Hero Characters and n Villain Characters and store them in 2 Set Objects. One for Heroes and One for Villains.
        Create a Map that will use the Type enum as a key and the value will be the number of battles won for the Heroes and the Villains.
        Randomly select one Hero and one Villain.
        The Villain attacks first -- reduce the Heroes health by the Villain attack. Note the attacks should be a method call in this class.
        The Hero attacks second --- same as above.
        Print the toString method for the Villain then for the Hero
        If the Hero's or Villain's health is 0 or below remove them from their respective Set.
        Repeat until one of the sets is empty. Note one battle occurs each time through the loop.
        Print out which group won and the number of battles won for each group.
        */
import java.util.*;

enum Type
{
    HERO,VILLIAN
}
class Character
{
    String name;
    int health;
    int attack;
    Type type;
    public Character(String name,int health,int attack,Type type)
    {
        this.name=name;
        this.health=health;
        this.attack=attack;
        this.type=type;
    }


    public void attack(Character target){
        int damage=this.attack;
       target.health-=damage;
    }
    public String toString(){
        return "Name: "+name+",Health: "+health+",Attack: "+attack+",Type: "+type;
    }
}
 public class Battle {
     public static void main(String[] args) {
         HashSet<Character> heroes = new HashSet<>();
         HashSet<Character> villians = new HashSet<>();
         // creating heroes
         Character hero1 = new Character("Bhamsi", 100, 100, Type.HERO);
         Character hero2 = new Character("Turgut", 100, 100, Type.HERO);
         Character hero3 = new Character("Duan", 100, 100, Type.HERO);
         Character hero4 = new Character("Ertugrul", 100, 100, Type.HERO);
         heroes.add(hero1);
         heroes.add(hero2);
         heroes.add(hero3);
         heroes.add(hero4);
         // creating villians
         Character villian1 = new Character("Dragos", 40, 40, Type.VILLIAN);
         Character villian2 = new Character("Emir Sadetin", 15, 50, Type.VILLIAN);
         Character villian3 = new Character("Vasilius", 100, 100, Type.VILLIAN);
         Character villian4 = new Character("Noyan", 50, 50, Type.VILLIAN);
         villians.add(villian1);
         villians.add(villian2);
         villians.add(villian3);
         villians.add(villian4);
         //creating map
         Map<Type, Integer> scoreBoard = new HashMap<>();
        // Map<Type, Integer> villiansBattlesWon = new HashMap<>();
         for (Type type : Type.values()) {
             scoreBoard.put(type, 0);
             //villiansBattlesWon.put(type, 0);
         }
         int battleCount = 0;
         int heroesWon=0;
         int villianWon=0;
         while (!heroes.isEmpty() && !villians.isEmpty()) {
             battleCount++;
             System.out.println("Battles : " + battleCount);
             Character hero = getRandomCharacter(heroes);
             Character villian = getRandomCharacter(villians);

             //villians attacks first
             villian.attack(hero);
             System.out.println(villian.name + " attacked " + hero.name + " for " + villian.attack + " damage");
             //heroes attack
             if (hero.health > 0) {
                 hero.attack(villian);
                 System.out.println(hero.name + " attacked " + villian.name + " for " + hero.attack + " damage");
             }
             heroes.remove(hero);
             villians.remove(villian);

             if (hero.health <= 0) {
                 //  heroes.remove(hero);
                 villianWon++;
                 scoreBoard.put((Type.VILLIAN), villianWon);
             }
             if (villian.health <= 0) {
                 // villians.remove(villian);
                 heroesWon++;
                 scoreBoard.put(Type.HERO, heroesWon);
             }
         }

         if(heroesWon>villianWon){
             System.out.println("heroes won after " + battleCount + " battles");
         }
         else if (villianWon>heroesWon) {
             System.out.println("villians won after " + battleCount + " battles");
         }
         else {
             System.out.println("The battle is Tied");
         }
         System.out.println("heroes battle counts: " + scoreBoard.get(Type.HERO));
         System.out.println("villians battle counts: " + scoreBoard.get(Type.VILLIAN));
     }

     public static Character getRandomCharacter(Set<Character> characters) {
       int index=(int)(Math.random()*characters.size());
       return(new ArrayList<Character>(characters)).get(index);
     }
}