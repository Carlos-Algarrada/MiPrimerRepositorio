#Ejercicio 1: Número positivo o negativo. Escribe un programa que pida un número al
#usuario e indique si el número es positivo, negativo o cero.
    
numero = float(input ("Indique un número: "))

if numero == 0:
    print ("El número es 0")
elif numero > 0:
    print ("El número es positivo")
else:
    print ("El número es negativo")

