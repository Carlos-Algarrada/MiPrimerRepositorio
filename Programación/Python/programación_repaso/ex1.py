"""
1. Ejercicio: Crear una lista de nombres
Crea un programa que pida al usuario que ingrese cinco nombres, uno por uno, y los guarde
en una lista. Al final, el programa debe imprimir todos los nombres ingresados.
"""

lista =[]
contador = 5
while contador > 0:
    lista.append(input("Dime un nombre: "))
    contador -= 1
    
print (f"Estos son los nombres que has elegido {lista}")