'''Tarea 1. cada ejercicio es una función habrá un menú en mi main
que será una funcion que invoque otras funciones'''

def ejercicio_1():
    nombre =(input("Introduce nombre: "))
    print (f"Hola{nombre}")
        
def ejercicio_14():
    #Inversión anual con interés
    cantidad = float(input("Cantidad a invertir: "))
    interes = float(input("interes anual: "))
    anos = int(input("Años de la inversión: "))
    
    for i in range(1, anos+1):
        cantidad += cantidad* (interes/100)
        # .2f el "." es para decir decimales, el "2" es para decir cuantos decimales 
        # y el "f" es para la coma flotante
        print(f"Capital tras el año {i}: {cantidad:.2f}€")

def ejercicio_2_8():
    #numeros impares entre dos números
    inicio = int(input("Primer número: "))
    fin =int (input("Segundo número: "))
    #range (nº que empieza ya sea 1 o lo que sea, el numero que sigue 
    # si se le pone un + o un - se le resta el numero que se le ponga)
    for i in range(inicio, fin+1):
        if i % 2 !=0:
            print(i)
        
        
def menu():
    print ("Selecciona un ejercicio")
    print ("1.Ejercicio 1")
    print ("14.Ejercicio 14")
    print ("28. ejercicio 2_8")
    print ("Presione Q para salir")
    
while True:
    menu()
    numero_menu = input("Elige una opción: ")
    if numero_menu == "1":
        ejercicio_1()
    elif numero_menu == "14":
        ejercicio_14()
    elif numero_menu == "28":
        ejercicio_2_8()    
    elif numero_menu == "Q":
        print("Saliendo del programa...")
        break
    else:
        print("Opción no valida intentelo de nuevo")
        
        