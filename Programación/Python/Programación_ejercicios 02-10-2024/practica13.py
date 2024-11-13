#Escribir un programa que pida al usuario un número entero positivo y muestre por
#pantalla la cuenta atrás desde ese número hasta cero separados por comas.

numero = int(input("Escribe un número entero positivo ="))
aux=numero
for i in range(numero):
    print(aux, end=",")
    aux=aux - 1
    
