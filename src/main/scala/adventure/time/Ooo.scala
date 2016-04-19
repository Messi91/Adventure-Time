package adventure.time

/**
  * Created by mesfin on 19/04/16.
  */
case class Ooo(importantSettings: Unit) {

  private[this] val finn = Hero("Finn")
  private[this] val jake = Hero("Jake")

  def findHero: Hero = {
    finn
  }

  def friendsRegistry(): Map[String, Hero] = {
    Map(finn.name -> jake)
  }

  def evalAdventure(hero1: Hero, hero2: Hero): String = {
    if (hero1 == jake || hero2 == jake) "awesome" else "disappointing"
  }
}