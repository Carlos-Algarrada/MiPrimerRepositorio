'''6. Ejercicio: Búsqueda en una listaCrea un programa que permita al usuario ingresar varios nombres de personas y
luego buscar si un nombre específico está en la lista. Si el nombre existe, muestra
su posición en la lista; si no, indica que no se encontró.'''

lista_nombres =[]

iteracion = 1
while True:
    nombre = input(f"Ingresa el nombre {iteracion} o end para acabar: ")
    if nombre == "end":
        break
    lista_nombres.append(nombre)
    iteracion += 1
    
buscar = input(f"ingresa el nombre que quieres buscar: ")

if buscar in lista_nombres:
    print(f"El nombre {buscar} esta en la posición {lista_nombres.index(buscar) +1}")
else:
    print(f"El nombre {buscar} no está en la lista")
    