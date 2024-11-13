#funciones recursivas

#son funciones que se llamana asi mismas, son utiles cuando un problema puede 
# descomponerse en subproblemas más pequeños de la misma naturaleza

def factorial_recursivo(n):
    if n==0 or n==1:
        return 1
    else:
        return n* factorial_recursivo(n -1)

print (factorial_recursivo(4))