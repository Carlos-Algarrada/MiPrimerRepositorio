#1. append(item): Añade un elemento al final de la lista:


def num_par(num):
    return num % 2 ==0
    
def numeros_pares(lista):
    pares = []
    for num in lista:
        if num_par(num):
            pares.append(num)
    return pares
    