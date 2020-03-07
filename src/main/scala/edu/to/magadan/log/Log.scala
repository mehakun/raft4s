package edu.to.magadan.log

trait Log[F[_]] {
  type Entry = Array[Byte]

  def append(entry: Entry): F[Unit]
  def confirmLastEntry: F[Unit]
  def entryAtIndex(index: Int): F[Option[Entry]]
  def size: F[Int]
}