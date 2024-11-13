#EJERCICIOS DE FUNCIONES

#Ej1. Define una funcion que reciba una lista de numeros y retorne una nueva lista con los numeros pares.
#lista = (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

def es_par(num):
  """devolver = num % 2
  if num % 2 == 0:
    return num""" 
  return num % 2 == 0 

def numeros_pares(lista):
  pares = []
  for num in lista:
    if es_par(num):
          pares.append(num)
  return pares
  
pares = [1, 2, 3, 4, 5, 6]
print ("Segundo id fuera de la función", id(pares))
print (numeros_pares(pares))
        


#Ej2. Crea una función que reciba una cadena de texto y cuente cuantas palabras tiene.

saludo = "Hola me llamo carlos"
lista = saludo.split()
print(len(lista))

#Ej3. Escribe una función que utilice *args y **kwargs para aceptar múltiples parámetros y los imprima como formato.

def imprimir_datos(*args, **kwargs):
  print("Argumentos poscionales:", args)
  print("Argumentos nombrados:", kwargs)
  
#Ejemplo de uso de la función Ej3

imprimir_datos(1,2,3,4,5, nombre="juan", edad= 30, direccion= "C\ Honduras")

