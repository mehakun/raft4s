package edu.to.magadan

sealed trait NodeState

object NodeState {
  final case object Leader extends NodeState
  final case object Candidate extends NodeState
  final case object Follower extends NodeState
  final case object Offline extends NodeState
}