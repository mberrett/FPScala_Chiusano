// DEFINING ALTERNATIVES WITH SEALED TRAITS & PATTERN MATCHING

sealed trait Symbol
case class Note(name: String, duration: String, octave: Int) extends Symbol
case class Rest(duration: String) extends Symbol

def symbolDuration(symbol: Symbol): String =
  symbol match {
    case Note(name, duration, octave) => duration
    case Rest(duration) => duration
  }

val d4 = Note("D", "Quarter", 4)
symbolDuration(d4) // res3: String = Quarter


// ALGEBRAIC DATA TYPES
/* Data types defined with sealed trait and case classes are called
  algebraic data types. An algebraic data type definition can be
  thought of as a set of possible values. */

sealed trait Duration
case object Whole extends Duration
case object Half extends Duration
case object Quarter extends Duration

def fractionOfWhole(duration: Duration): Double =
  duration match {
    case Whole => 1.0
    case Half => 0.5
    case Quarter => 0.25
  }

fractionOfWhole(Half) // res4: Double = 0.5
