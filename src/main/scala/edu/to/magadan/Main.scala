package edu.to.magadan
import zio.ZIO
import zio.console.putStrLn

object Main extends zio.App {
  def run(args: List[String]): ZIO[zio.ZEnv, Nothing, Int] =
    for {
      _ <- putStrLn("Hello, Raft4s!")
    } yield 0
}