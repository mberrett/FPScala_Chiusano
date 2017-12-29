// Newton's Method for Square Root Approximation

def abs(x: Double) = if (x > 0) x else -x

def improve(guess: Double, x: Double) = {
  (guess + x / guess)/ 2
}

def isGoodEnough(guess: Double, x: Double) = {
  abs(guess * guess - x) < 0.001
}

def sqrtIter(guess: Double, x: Double): Double = {
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)
}

sqrtIter(1,2) // res1: Double = 1.4142156862745097
