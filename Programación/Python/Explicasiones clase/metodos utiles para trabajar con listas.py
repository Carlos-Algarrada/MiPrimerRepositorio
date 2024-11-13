"""
Metodos utiles para trabajar con listas
"""
#1. append(item): Añade un elemento al final de la lista

frutas = ["banana","manzana"]
frutas.append("naranja")
print (frutas) #Salida: banana, manzana, naranja

#2. extend(iterable). Añade todos los elementos de un iterable
#(puede ser una lista) al final de la lista.

frutas =["banana", "manzana"]
frutas.extend(["naranja", "kiwi"])
print(frutas) #out :[banana, manzana, naranja, kiwi]

#3. insert(index, item). Inserta un elemento en la lista en la 
#posición que indica el indice.

frutas =["manzana", "banana"]
frutas.insert(1, "platanos")
print (frutas) #out ::['manzana', 'platanos', 'banana']

#4. remove(item) Elimina el primer elemento especificado de la lista
#si el elemnto no existe genera un error.

frutas =["banana", "manzana", "naranja"]
frutas.remove("manzana")

print(frutas) #out: ["banana", "naaranja"]

#5. pop(index). Elimina y devuelve el elemento en la posición
#especificada por el indice. S no se especifica un indice, elimina
# y devuelve el último elemento de la lista.

frutas =["banana", "manzana", "naranja"]
fruit = (frutas.pop(0)) #elimina y devuelve el último elemento.
print(fruit)
print(frutas)

#6. index(item) DEvuelve el indice de la primera aparición del
#elementon especificado, si no lo encuentra, genera un error.

frutas =["banana", "manzana", "naranja"]
indice= frutas.index("banana")
print(indice)

#7. count(item) devuelve el numero de veces que aparece un 
#elemento en la lista.

frutas =["banana", "manzana", "naranja", "banana"]
cantidad= frutas.count("banana")
print(f"Las veces que se repite el item es: {cantidad}")

#8. sort(key=None, reverse=False) Ordena los elementos de la lista
#en su lugar, modificando la lista original. se pude especificar 
#una función key para personalizar el orden y un parametro reserve
#para ordenar en orden descendente.

frutas =["naranja", "manzana", "banana"]
frutas.sort()
print (frutas)

#9. reverse() invierte el orden de los elementos de la lista.

frutas =["naranja", "manzana", "banana"]
frutas.reverse()
print("reverse()", frutas)

#10. clear() elimina todos los elementos de la lista dejandola vacía.

frutas =["naranja", "manzana", "banana"]

frutas.clear()
print(f"Clear() {frutas}")

#11. sort() ordena de mayor a mayor los elementos de una lista