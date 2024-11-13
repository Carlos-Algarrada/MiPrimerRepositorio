'''Ejercicio 99. Proyecto Modularizado
1. Crea un pequeño proyecto donde deberás implementar las siguientes
funcionalidades:
○ Crear una lista de números aleatorios entre 1 y 100.
○ Encontrar el número más grande y el más pequeño de la lista.
○ Contar cuántas veces aparece cada número en la lista y almacenar los
resultados en un diccionario.
○ Ordenar la lista de manera ascendente.
2. Estructura del proyecto:
○ Archivo main.py: El archivo principal que importará las funciones necesarias.
○ Módulo listas_util.py: Contendrá las funciones para generar la lista,
encontrar el máximo y mínimo.
○ Módulo diccionarios_util.py: Contendrá las funciones para contar las
ocurrencias de los números.
○ Módulo ordenar.py: Contendrá la función para ordenar la lista.'''

from ordenar import ordenar
from diccionarios_util import diccionario
from listas_util import listas, max_min

def main ():
    print ("Buscaremos numeros aleatorios entre 1 y 100")
    
    lista = listas(1, 100)
    print ("Aqui tienes tú lista ",lista)
    
    minimo, maximo = max_min(lista)
    
    print (f"El número minimo es {minimo} y el número máximo es {maximo}")
    
    ordenacion_numeril = ordenar(lista)
    
    print ("Aqui tienes la lista ordenada ", ordenacion_numeril)
    
    dic = diccionario(ordenacion_numeril)
    print ("Aqui tienes el diccionario ", dic)

main ()
