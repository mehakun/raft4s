package edu.to.magadan

sealed trait NodeState

object NodeState {
  case object Leader extends NodeState
  case object Candidate extends NodeState
  case object Follower extends NodeState
  case object Offline extends NodeState
}