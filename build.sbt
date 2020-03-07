import _root_.sbt.Keys._

name := "rafic"

version := "1.0"

scalaVersion := "2.13.1"

scalacOptions := List(
  "-encoding",
  "utf8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8",
  "-language:_",
  "-Ymacro-annotations"
)

// TODO: optimize dependencies

val akkaVersion       = "2.6.0"
val akkaHttpVersion   = "10.1.10"
val circeVersion      = "0.12.1"
val circeDerVersion   = "0.12.0-M7"
val catsVersion       = "2.0.0"
val catsEffectVersion = "2.0.0"
val fs2Version        = "2.0.0"
val shapelessVersion  = "2.3.3"
val simulacrumVersion = "0.19.0"
val zioVersion        = "1.0.0-RC17"
val zioCatsVersion    = "2.0.0.0-RC8"
val zioMacrosVersion  = "0.5.0"
val tofuVersion       = "0.5.1.1"
val tschemaVersion    = "0.11.5"
val derevoVersion     = "0.10.5"
val korolevVersion    = "0.14.0"
val magnoliaVersion   = "0.12.3"
val newtypeVersion    = "0.4.3"
val refinedVersion    = "0.9.13"

libraryDependencies += "org.scalactic"  %% "scalactic"   % "3.0.8"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.0.8" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.1-RC2" % "test"
libraryDependencies += "org.mockito"    % "mockito-core" % "3.0.0" % "test"

libraryDependencies += "com.typesafe.akka" %% "akka-actor"       % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-stream"      % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-remote"      % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j"       % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-http"        % akkaHttpVersion

libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit"      % akkaVersion     % "test"

libraryDependencies += "org.typelevel" %% "cats-core"        % catsVersion
libraryDependencies += "org.typelevel" %% "cats-free"        % catsVersion
libraryDependencies += "org.typelevel" %% "cats-effect"      % catsEffectVersion
libraryDependencies += "co.fs2"        %% "fs2-core"         % fs2Version
libraryDependencies += "co.fs2"        %% "fs2-io"           % fs2Version
libraryDependencies += "dev.zio"       %% "zio"              % zioVersion
libraryDependencies += "dev.zio"       %% "zio-streams"      % zioVersion
libraryDependencies += "dev.zio"       %% "zio-interop-cats" % zioCatsVersion

libraryDependencies += "io.circe" %% "circe-core"                   % circeVersion
libraryDependencies += "io.circe" %% "circe-generic"                % circeVersion
libraryDependencies += "io.circe" %% "circe-parser"                 % circeVersion
libraryDependencies += "io.circe" %% "circe-generic-extras"         % circeVersion
libraryDependencies += "io.circe" %% "circe-derivation"             % circeDerVersion
libraryDependencies += "io.circe" %% "circe-derivation-annotations" % circeDerVersion

libraryDependencies += scalaOrganization.value % "scala-reflect"  % scalaVersion.value
libraryDependencies += scalaOrganization.value % "scala-compiler" % scalaVersion.value

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging"  % "3.9.2"
libraryDependencies += "ch.qos.logback"             % "logback-classic" % "1.2.3"

libraryDependencies += "com.chuusai"          %% "shapeless"  % shapelessVersion
libraryDependencies += "com.github.mpilquist" %% "simulacrum" % simulacrumVersion

libraryDependencies += "com.github.fomkin" %% "korolev"                     % korolevVersion
libraryDependencies += "com.github.fomkin" %% "korolev-server"              % korolevVersion
libraryDependencies += "com.github.fomkin" %% "korolev-server-akkahttp"     % korolevVersion
libraryDependencies += "com.github.fomkin" %% "korolev-cats-effect-support" % korolevVersion
libraryDependencies += "com.github.fomkin" %% "korolev-async"               % korolevVersion

libraryDependencies += "com.propensive" %% "magnolia" % magnoliaVersion

libraryDependencies += "io.estatico" %% "newtype" % newtypeVersion

libraryDependencies ++= Seq(
  "eu.timepit" %% "refined"                 % refinedVersion,
  "eu.timepit" %% "refined-cats"            % refinedVersion,
  "eu.timepit" %% "refined-scalacheck"      % refinedVersion,
  "eu.timepit" %% "refined-shapeless"       % refinedVersion
)

addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.11.0" cross CrossVersion.patch)
