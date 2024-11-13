""" Funciones y Modularidad.

la sintaxis básica de una fúnción:

"""
import modulos  
from modulos import sumar as s
""" def nombre_funcion(parametros):
        #cuerpo de la función
        return resultado

def:palabra clave para definir una función.
nombre_función: nombre descriptivo que la id
parámeros: variables que recibe la función
return: devuelve un valor (opcional)"""

#Ejemplo básico

def saludar(nombre):
    print (f"Hola, {nombre}")

#Llamada o invoación a la función

saludar("Carlos")

"""
Parametros posicionales. Deben ser proporcionados en el mismo
orden en que se definen en la función.

Parametros nombreados (keyword arguments) que permiten especificar
un valoir de manera explicita, sin importar el orden
"""
def mostrar_info(nombre, edad):
    print(f"Nombre: {nombre}, Edad: {edad}")
    
#Llamada con param pos
mostrar_info("Lucía", 25)

#Llamada con parametros nombrados
mostrar_info(edad=30, nombre="Paco") 

#Valores por defecto en parametros
def saludar(nombre, mensaje="Hola"):
    print(f"{mensaje}, {nombre}")

saludar("Ana")

saludar("Ana", "Buenos días")

#Funciones que devuelven valoires -> return

def sumar(a,b):
    return a + b

#argumentos y parametros flexibles

#Parámetro posicional indefinido: *args
def suma(*numeros):
    total =0
    for num in numeros:
        total += num
    return total

#llamad a la función

print (suma(1, 2, 3, 4))
# *args permite recibir una tupla con todos los valores que se pasan 
#como argumentos adicionañes

"""
Parámetros nombrados indefinidos : **kwargs
permite recibir un numero indefinido de parametros con nombre
en forma de diccionario
"""
def mostrar_datos(**datos):
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")

mostrar_datos(nombres="ana", edad=25, ciudad="madrid")


dicc1 = {
    "nombre": "sara",
    "edad": 27,
    "dni":123456789
}

print(dicc1)

#funciones anidadas y ambit de variables

#funciones dentro de una función. es util cuando una función
#necesita lógica adicionañ que no se utilizara fuera de su contexto.

def operacion(opcion):
    def suma(a, b):
        return a + b
    def resta (a, b):
        return a - b
    if opcion == "sumar":
        return suma
    elif opcion == "restar":
        return resta
    
func = operacion ("sumar")
print (func(5,3)) #salida: 8
func = operacion ("restar")
print (func(5,3)) #salida: 2

#ambito de variables: las variables definidas dentro de una
#funcion tiene un ambito local, lo que significa que no son
#accesibles fuera de esa función

def saludo():
    mensaje = "hola, dam1"
    print (mensaje)
    
saludo() #salida: hola, dam1

#funciones lambda: funciones anónimas
#Son funciones pequeñas y rápidas definidas en una sola linea
#que son utiles cuando se necesita una función para un uso temporal

#uso de lambda: uso lambda:lambda parámetros: expresion
#EJ. funcion lambda para sumar 2 numeros

suma = lambda a, b : a + b
print(suma(5,3))
numeros =[1, 2, 3, 4, 5]
dobles = list(map(lambda x: x*2, numeros))
print(dobles)

#Funciones como objetos. Es decir, las funciones pueden ser asignadas
#a variables, pasarlas como argumentos y retornarlas desde otras funciones.

def saludo():
        return "Hola"
def despedida():
    return "Adiós"

#Asigno una función a una variable.

accion = saludo

print (accion())

#Pasar funciones como argumento
def ejecutar_funcion(func):
    print(func())

ejecutar_funcion(despedida)

#Decoradores. Funciones avanzadas que permiten modificar el comportamiento 
# de una función sin cambiar su código. Son funciones que reciben otra 
#función como argumento y devuelven una nueva función.

def decorador(func):
    def nueva_funcion():
        print("Antes de la función original")
        func()
        print("Despues de la función original")
    return nueva_funcion

@decorador
def saludar():
    print("Hola")

saludar()


#Modularidad 

#Un módulo en python es un archivo que contiene definiciones y declaraciones de variables, 
# funciones y clases. Los módulos permiten organizar el código en partes reutilizables y 
# separar funcionalidades dentro de un proyecto

#para usar el contenido de un modulo en otro archivo -> import

resultado_suma = modulos.sumar(5, 3)
print(resultado_suma)#salida: 8

resultado_resta = modulos.restar(5, 3)
print(resultado_resta)#Salida: 2

resultado_suma = s(6, 6)
print(f"Suma con alias s: {resultado_suma}")
