'''Ejercicio 7: Contar números negativos introducidos. Escribe un programa que pida
números hasta que el usuario introduzca el número 0. Al finalizar, el programa debe mostrar
cuántos números negativos fueron introducidos.'''

lista = []
while True:
    numeros = int(input("Dime un número negativo, cuando pongas un 0 se acaba el bucle: "))
    if numeros < 0:
        lista.append(numeros)
    elif numeros == 0:
        print (f"Estos son los números que has introducido: {lista}")
        break    
    else:
        print("Eso es un número positivo")
    
    