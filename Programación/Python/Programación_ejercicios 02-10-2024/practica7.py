#Escribir un programa que pida al usuario dos números y muestre por pantalla su
#división. Si el divisor es cero el programa debe mostrar un error.

numero1 = float(input("Dime un numero que sea el dividendo: "))
numero2 = float(input("Dime otro número que sea el divisor: "))

if numero2 == 0 :
    print("Introduce un numero que no sea 0")
else:
    numero3 = numero1/numero2
    print("Esta es tú división: ", numero3) 