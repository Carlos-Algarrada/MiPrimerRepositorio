'''Ejercicio 4: Suma de números del 1 al 100. Escribe un programa que calcule la suma de
todos los números del 1 al 100 utilizando un bucle for.'''
contar = 0
suma = 0
for i in range (1, 100+1):
    suma += i 
    print (f"La suma de {contar} + {i} = ", suma)
    contar = suma    