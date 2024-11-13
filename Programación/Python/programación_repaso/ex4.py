'''
4. Ejercicio: Diccionario de notas de estudiantes
Escribe un programa que permita al usuario ingresar las notas de varios estudiantes. Cada
estudiante tendrá un nombre y una nota. Utiliza un diccionario para almacenar esta
información, donde la clave será el nombre del estudiante y el valor será la nota. El
programa debe permitir ingresar hasta 5 estudiantes. Al final, muestra todas las notas y
calcula el promedio de las mismas
'''
notas_estudiantes = {}

for i in range(5):
    nombre = input(f"Ingrese el nombre del estudiante número {i+1}: ")
    
    try:
        nota= float(input(f"Ingrese la nota de {nombre}: "))
        notas_estudiantes [nombre] = nota
    except ValueError:
        print("Nota no válida. Ingrese un número.")
        
print (notas_estudiantes)

promedio = sum(notas_estudiantes.values())/ len(notas_estudiantes)
print ("El promedio de las notas de los estudiantes es: ", promedio)