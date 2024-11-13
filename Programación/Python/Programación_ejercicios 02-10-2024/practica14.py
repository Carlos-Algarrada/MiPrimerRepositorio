#Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual
#y el número de años, y muestre por pantalla el capital obtenido en la inversión cada
#año que dura la inversión

inversion = float (input("Dime tu inversión: "))
ianual = float (input("Dime el interés anual: "))
anos = int (input("Dime el numeros de años: "))

for ano in range(1, anos + 1):
    inversion *= (1 + ianual / 100)
    print("Capital tras el año", ano, inversion, "€")
    
    