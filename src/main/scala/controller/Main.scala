package controller

import adventure.time.AdventureTime

/**
  * Created by mesfin on 19/04/16.
  */
object Main extends App {

  val hero = AdventureTime.getHero
  println("Hero = " + hero.name)

  val bestFriend = AdventureTime.getBestFriend(hero)
  println("Best friend = " + bestFriend.name)

  val adventure = AdventureTime.goOnAdventure(hero, bestFriend)
  println(adventure)
}