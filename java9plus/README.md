# Notable Changes in Java 9 & up

Below is a summary of the notable changes in each Java release from Java 9 on.

* Features that are marked *(Removed)* have been removed from the JDK
  distribution, but still exist as separate modules.
* Features that are marked *(Eliminated)* have been completely abandoned, and
  are no longer available.
* Features that are marked *(Preview)* were added to or enhanced in that release
  in order to solicit feedback, but the feature may ultimately change before
  final release. Preview features must be opted into, and should be used with
  caution.

## Java 9

* Modularization (Project Jigsaw)
    * Java Linker, for creating custom runtime images
* JShell
* Ahead-of-time compilation
* Reactive Streams
* "Effectively final" variables in try-with-resources (instead of explicitly
  `final`)
* Private methods in interfaces
* *(Eliminated)* JavaDB

## Java 10

*Java 10 was a small release from the standpoint of the average developer. Most
of the work was done on the internals of the JVM, such as garbage collection,
Unicode, and threading.*

* Local variable type inference (`var`)

## Java 11

* Java programs as shell scripts
* Built-in HTTP client
* Variable type inference for Lambda parameters
* Flight Recorder
* TLS 1.3
* *(Eliminated)* Java Applets
* *(Eliminated)* Java Web Start
* *(Removed)* JavaFX
* *(Removed)* Java EE
* *(Removed)* CORBA

## Java 12

*Java 12 was another smaller release. Only one notable developer-facing feature
was included. The remainder of the release consisted of low-level JVM
enhancements and a new set of APIs for manipulating bytecode.*

* *(Preview)* Switch expressions

## Java 13

* *(Preview)* Switch expressions (continued)
    * This release contained a breaking change from the preview in Java 12
* *(Preview)* Text blocks
* Reimplemented Socket API

## Java 14

* Improved `NullPointerException`
* Switch expressions (standard)
    * No breaking changes from the preview in Java 13
* *(Preview)* Text blocks
    * Provided 2 new escape sequences over the preview in Java 13
* *(Preview)* Pattern matching for `instanceof`
* *(Preview)* Record classes

## Java 15

* Text blocks (standard)
    * No breaking changes from the preview in Java 14
* Hidden classes, which keep certain framework implementation details secret
  from consumers of the framework
* Reimplemented Datagram (UDP) Socket API
* *(Removed)* Nashorn JavaScript engine
* *(Preview)* Pattern matching for `instanceof`
    * No breaking changes from the preview in Java 14
* *(Preview)* Record classes
    * No breaking changes from the preview in Java 14
* *(Preview)* Sealed classes

## Java 16

_TODO_

## Java 17

_TODO_

## Java 18

_TODO_
