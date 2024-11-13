"""
2. Ejercicio: Validación de números enteros
Crea un programa que solicite al usuario un número entero positivo. Si el número no es
válido (por ejemplo, si es negativo o no es un número), el programa debe pedir que se
ingrese de nuevo hasta que se ingrese un valor correcto.
"""

while True:
    try: 
        numero= int(input("Introduce un numero positivo: "))
        if numero < 0:
            print("Introduce un número positivo")
        else:
            print (f"Este es el número positivo que has introducido: {numero}")
            break
    except ValueError:
            print("Eso no es un numero, porfavor introduce un numero positivo")