package com.tweetanalyzer

import akka.{Done, NotUsed}
import akka.actor.ActorSystem
import akka.stream._
import akka.stream.scaladsl._

import scala.concurrent.Future

object Main extends App {

  implicit val system = ActorSystem("analyzer")
  implicit val materializer = ActorMaterializer()
  implicit val ec = system.dispatcher

  val source: Source[String, NotUsed] = Source(List("abc","bbc","bleh"))
  val sink = Sink.foreach(println)

  val done: Future[Done] = source.runWith(sink)

  done.onComplete(_ ⇒ system.terminate())
}
