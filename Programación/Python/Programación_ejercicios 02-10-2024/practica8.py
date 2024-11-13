#Escribir un programa que pida al usuario dos números y devuelva su división. Si el
#usuario no introduce números debe devolver un aviso de error y si el divisor es cero también.
try:
    
    numero1 = float(input("Dime un numero que sea el dividendo: "))
    numero2 = float(input("Dime otro número que sea el divisor: "))

    if numero2 == 0 :
        print("Introduce un numero que no sea 0")
    else:
        numero3 = numero1/numero2
        print("Esta es tú división: ", numero3) 
    
except ValueError:
   print ("Inserta un número valido")
    