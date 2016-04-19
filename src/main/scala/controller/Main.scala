package controller

import adventure.time.{Ooo, AdventureTime}

/**
  * Created by mesfin on 19/04/16.
  */
object Main extends App {

  val at = new AdventureTime(Ooo(()))

  val hero = at.getHero
  println("Hero = " + hero.name)

  val bestFriend = at.getBestFriend(hero)
  println("Best friend = " + bestFriend.name)

  val adventure = at.goOnAdventure(hero, bestFriend)
  println(adventure)
}