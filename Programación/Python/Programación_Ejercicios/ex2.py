#Ejercicio 2: Número par o impar. Escribe un programa que pida un número entero y
#determine si es par o impar.

num= float (input("Ingresa un número: "))

if num % 2 !=0:
    print (num, "es impar")
else:
    print(num, "es par")