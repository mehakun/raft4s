package edu.to.magadan

import io.estatico.newtype.macros.newtype

import scala.concurrent.duration.FiniteDuration

case class TimeoutConfig(heartbeatTimeout: Timeout.Heartbeat, electionTimeout: Timeout.Election, appendTimeout: Timeout.Append)

object Timeout {

  @newtype
  case class Heartbeat(value: FiniteDuration)

  @newtype
  case class Election(value: FiniteDuration)

  @newtype
  case class Append(value: FiniteDuration)

}