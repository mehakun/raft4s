package edu.to.magadan

case class Term(term: Int) extends AnyVal

// NOTE: maybe its better to move term and state into some CurrentNodeContext
case class Node(state: NodeState, nodes: List[Node], id: Int, term: Term)