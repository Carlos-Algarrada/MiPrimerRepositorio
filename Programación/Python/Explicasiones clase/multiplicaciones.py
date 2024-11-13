""" Crea un programa que imprima todas las tablas de multiplicar del 1 al 9, ambos inclusive
por ejemlo: 1*1 = 1

Pista de eficiencia: utiliza 2 for anidados."""
#Se agrega una variable a la cual se le asgina el 0
mult = 0
# Se hace el for i para poner la tabla del número
for i in range (1,10):
    print ()
    print (f"Esta es la tabla del {i}")
    # se hace otro for para el número que multiplica
    for j in range (1,11):
        #Se utiliza una variable donde se usa la tabla del número con 
        #el número que multiplica
        mult = i * j
        print(f"{i} * {j} = {mult}")