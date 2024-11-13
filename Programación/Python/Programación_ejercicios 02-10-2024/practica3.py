#Escribir un programa que pregunte el nombre del usuario en la consola y después de
#que el usuario lo introduzca muestre por pantalla el nombre en mayúsculas y el
#número de caracteres que contiene en líneas distintas.

nombre = str (input ("¿Cual es tú nombre? "))

print ("Tu nombre en mayusculas", nombre.upper())

print ("los caracteres que contiene tú nombre", len(nombre))
