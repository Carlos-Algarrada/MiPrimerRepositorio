#Ejercicio 1: Ordenar una lista
#1. Escribe una función llamada ordenar_lista que reciba una lista de números que
#devuelva la lista ordenada en orden ascendente.
#2. Modulariza el programa importando la función desde un archivo llamado
#utilidades.py
"""
.sort() modifica la lista y no devuelve nada.
        solo se puede usar con listas
sorted() devuelve una nueva lista con los datos ordenados
        Puede usarse en cualquier iterable
"""
import utilidades
from utilidades import ordenar as ord
lista = [5,3,8,1,2]

listar_ordenada= ord(lista)

print(listar_ordenada)

