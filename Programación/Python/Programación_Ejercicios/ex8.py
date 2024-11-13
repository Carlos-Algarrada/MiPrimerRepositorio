'''
Ejercicio 8: Números impares entre dos números. Escribe un programa que pida dos
números y muestre los números impares que hay entre ellos.
'''

numero1 = int(input("Dime un número: "))
numero2 = int(input("Dime otro numero que sea mayor al anterior: "))

for i in range (numero1, numero2+1):
    if i % 2 != 0:
        print (i, end=",")
print()
