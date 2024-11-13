#Funciones ITERATIVAS.
#Las que repietn una operaciones hasta que se cumple una condición

#Son utiles cuando se necesita procesar una colección de datos o se 
# desea realizar una tarea repetitiba un número especifico de veces

# FACTORIAL DE un NUMERO N. Es eñ producto de todos los números 
# enteros poitivos menores o menores o iguales a ese números

def factorial_iterativo(n):
    res = 1
    for i in range (1,n+1):
        res *= i
        print (res)
    return res

numero = int(input("Dime un número positivo: "))
num = factorial_iterativo(numero)
input (f"Este es el factorial de {numero} : {num}")