package controller

import adventure.time.Ooo
import adventure.time.AdventureTime._

/**
  * Created by mesfin on 19/04/16.
  */
object Main extends App {

  val ooo = Ooo(())

  val result = for {
    hero <- getHero(ooo)
    bestFriend <- getBestFriend(ooo, hero)
  } yield goOnAdventure(ooo, hero, bestFriend)

  println(result.getOrElse("There was no adventure :("))
}