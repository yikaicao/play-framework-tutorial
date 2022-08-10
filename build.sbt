name := """yikaicao-playframework"""
organization := "io.github.yikaicao"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies += guice
