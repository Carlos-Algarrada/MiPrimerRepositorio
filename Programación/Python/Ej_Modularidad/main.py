"""
Crea operaciones.py {+-x/^Raiz cuadrada}
Crea main.py y usa todas esas funciones
a=10
b=5

"""

import operaciones
from operaciones import multiplicación as x
from operaciones import division as div
from operaciones import elevado as elev
from operaciones import raiz_cuadrada as raiz


resultado_suma = operaciones.suma(10, 5)
print (resultado_suma)

resultado_resta = operaciones.resta(10,5)
print(resultado_resta)

resultado_multiplicacion = x(10,5)
print(resultado_multiplicacion)

resultado_division = div(10,5)
print(resultado_division)

resultado_elevado = elev(10,5)
print(resultado_elevado)

resultado_raiz = raiz(10)
print(resultado_raiz)