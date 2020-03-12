package edu.to.magadan

import io.estatico.newtype.macros.newtype

case class Node(state: NodeState, id: Node.Id, term: Node.Term, timeoutConfig: TimeoutConfig)

object Node {

  @newtype
  case class Term(value: Int)

  @newtype
  case class Id(value: Int)
}
