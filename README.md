# Interview task at Crestt

## Zadanie 
Dane wejściowe
Zadanie polega na stworzeniu programu transformującego dane wejściowe (z pliku test1.xlsx) do listy obiektów typu Node(id: Int, name: String, nodes: List[Node]) i wypisaniu tej listy na standardowe wyjście w formacie JSON. Elementów w liście będzie 4, pierwszy (A) będzie miał dwa podrzędne i tak dalej.

Język dowolny, preferowana Scala, dostarczony jako projekt  w publicznym repo - github, bitbucket. Do JSONa można użyć biblioteki.
Testy – zdecydowanie bardzo mile widziane.
Oczekiwana wysoka jakość kodu. Podejście bardziej funkcyjne niż imperatywne.


## Installation

Using build.sbt 

```bash
name := "crestt-test-task"

version := "0.1"

scalaVersion := "2.13.3"

//libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.144-R12"

libraryDependencies += "net.liftweb" %% "lift-webkit" % "3.4.1"
```
