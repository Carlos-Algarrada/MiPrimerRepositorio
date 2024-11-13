"""1. Escribe una función que reciba una lista de números y retorne una nueva lista con
solo los números pares.
2. Utiliza la función dentro del archivo principal, pero crea el módulo filtrado.py para la
definición de la función.
"""
import modulo_filtrado
from modulo_filtrado import numeros_pares as par

while true:
    numeros = input("dame números (termina con fin):")
    
    if numeros.lower()== "fin":
        break
    
    numero = int(numeros)
    lista_numeros.append(numero)

numeros_pares= par(lista)

print(numeros_pares)