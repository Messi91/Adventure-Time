package adventure.time

/**
  * Created by mesfin on 19/04/16.
  */
object AdventureTime {

  def getHero(ooo: Ooo): Option[Hero] = ooo.findHero

  def getBestFriend(ooo: Ooo, hero: Hero): Option[Hero] = {
    ooo.friendsRegistry().get(hero.name)
  }

  def goOnAdventure(ooo: Ooo, hero1: Hero, hero2: Hero): String = {
    val result = ooo.evalAdventure(hero1, hero2)
    s"Adventure time with ${hero1.name} and ${hero2.name} was $result."
  }
}