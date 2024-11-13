'''3. Ejercicio: Contar ocurrencias de elementos en una lista
Escribe un programa que reciba una lista de palabras y cuente cuántas veces aparece cada
palabra. Imprime los resultados.
'''

lista= []
print("Si quieres asalir del bucle pulsa q")
while True:
    palabra = input("Dime un nombre: ")
    if palabra == "q":
        break
    else:
        print (f"{palabra} Añadiendo el nombre a la lista")
        lista.append(palabra)
print (lista)
def contar (listas):
    lista={}
    #Le añade los nombres de la lista a nombre por el for
    for nombre in listas:
        if nombre in lista:
            lista[nombre] += 1
        else:
            lista[nombre] = 1
    for nombre, veces in lista.items():
        print (f"{nombre} : {veces}")

contar(lista)
