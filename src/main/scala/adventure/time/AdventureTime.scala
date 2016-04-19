package adventure.time

/**
  * Created by mesfin on 19/04/16.
  */
class AdventureTime(ooo: Ooo) {

  def getHero: Hero = ooo.findHero

  def getBestFriend(hero: Hero): Hero = ooo.friendsRegistry()(hero.name)

  def goOnAdventure(hero1: Hero, hero2: Hero): String = {
    val result = ooo.evalAdventure(hero1, hero2)
    s"Adventure time with ${hero1.name} and ${hero2.name} was $result."
  }
}