#matriz 3x3
"""
    1 2 3
    4 5 6 
    7 8 9
"""

for i in range (1, 4): #Blule externo, filas
    for j in range (1,4): #bucle interno, columnas
        print (f"{i*j}", end=" ") #imprime los elementos de 
                                  # una fila en una línea
    print() #salto al final de cada línea

print ()   
#Creas una variable llamada contador
contador = 1 
for ii in range (3): #Se le dice cuantas filas va a tener
    for jj in range (3): # Se le dice cuantas columnas va a tener
        print (f"{contador}", end=" ") #Imprime el número y le da un espacio
        contador += 1 #Le sumas un 1 a la variable contador
    print () #Salto al final de cada línea

        