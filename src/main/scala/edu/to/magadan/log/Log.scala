package edu.to.magadan.log

import edu.to.magadan.Node.Id

trait Log[F[_]] {
  type Entry = Array[Byte]

  def append(entry: Entry): F[Unit]
  def confirmLastEntry: F[Unit]
  def entryAtIndex(index: Int): F[Option[Entry]]
  def size: F[Int]
}

object Log {
  def apply[F[_]](id: Id): F[Log[F]] = ???
}