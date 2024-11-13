'''Ejercicio 6: Tabla de multiplicar. Escribe un programa que muestre la tabla de multiplicar
de un número introducido por el usuario (del 1 al 10).'''

numero = int(input("Dime un numero, te dire su tabla de multiplicar"))

for i in range (1, 10+1):
    multiplicacion = numero * i
    print("Tabla de multiplicar de ", numero)
    print (f"{numero} x {i} = {multiplicacion}")
    