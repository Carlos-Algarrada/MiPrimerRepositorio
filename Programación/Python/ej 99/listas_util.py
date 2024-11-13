import random

def listas (n, m):
    
    return [random.randint(n, m) for i in range (1,10+1)]

def max_min (lista):
    minimo = min(lista)
    maximo = max(lista)
    return minimo, maximo