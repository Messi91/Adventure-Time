package controller

import adventure.time.Ooo
import adventure.time.AdventureTime._

/**
  * Created by mesfin on 19/04/16.
  */
object Main extends App {

  val ooo = Ooo(())

  val hero = getHero(ooo)
  println("Hero = " + hero.name)

  val bestFriend = getBestFriend(ooo, hero)
  println("Best friend = " + bestFriend.name)

  val adventure = goOnAdventure(ooo, hero, bestFriend)
  println(adventure)
}