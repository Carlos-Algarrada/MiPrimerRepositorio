#Escribir un programa que pida al usuario un número entero positivo y muestre por
#pantalla todos los números impares desde 1 hasta ese número separados por comas.

numero = int(input("Escribe un número entero positivo ="))
x= 0
for i in range(numero):
    x = x+1
    resto = x%2
    if resto !=0:
        print(x, end=",")