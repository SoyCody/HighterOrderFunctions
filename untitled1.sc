def simpson(f: Double => Double, a: Double, b: Double): Double = {
  (b - a) * ((f(a) + 4 * f((a + b) /2)+f(b))/6)
}

def error(vEsperado: Double, vObtenido: Double): Double ={
  (vEsperado - vObtenido)
}

/*
val funcion = (x: Double) => x * x
val resultado = simpson(funcion, 0, 1)
*/

// 1. I = ∫b=5 a=3 (−x2 + 8x − 12)dx ≅ 7.33
val vEsperado1 = 7.33
val funcion1 = (x: Double) => -(math.pow(x, 2)) + 8 * x - 12
val resultado1 = simpson(funcion1, 3, 5)
val error1 = error(vEsperado1, resultado1)

// 2. I = ∫b=2 a=0 (3x^2)dx ≅ 8
val vEsperado2 = 8
val funcion2 = (x: Double) => 3 * (x * x)
val resultado2 = simpson(funcion2, 0, 2)
val error2 = error(vEsperado2, resultado2)

// 3. I = ∫b=1 a=−1(x + 2x^2 − x^3 + 5x^4)dx ≅ 3.333
val vEsperado3 = 3.333
val funcion3 = (x: Double) => x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val resultado3 = simpson(funcion2, -1, 1)
val error3 = error(vEsperado3, resultado3)

// 4. I = ∫b=2 a=1 (2x + 1) / (x^2 + x)dx ≅ 1.09861
val vEsperado4 = 1.09861
val funcion4 = (x:Double) => (2 * x + 1)/(math.pow(x, 2) + x)
val resultado4 = simpson(funcion4, 1, 2)
val error4 = error(vEsperado4, resultado4)

// 5. I = ∫b=1 a=0 (e^x)dx ≅ 1.71828
val vEsperado5 = 1.71828
val funcion5 = (x:Double) => math.exp(x)
val resultado5 = simpson(funcion5, 0, 1)
val error5 = error(vEsperado5, resultado5)

// 6. I = ∫b=3 a=2 1/ (x − 1)dx ≅ 0.828427
val vEsperado6 = 0.828427
val funcion6 = (x:Double) => 1/(math.sqrt(x - 1))
val resultado6 = simpson(funcion6, 2, 3)
val error6 = error(vEsperado6, resultado6)

// 7. I = ∫b=1 a=0 1/ (1 + x^2)d x ≅ 0.785398
val vEsperado7 = 0.785398
val funcion7 = (x:Double) => 1/(1 + (x * x))
val resultado7  = simpson(funcion7, 0, 1)
val error7 = error(vEsperado7, resultado7)

