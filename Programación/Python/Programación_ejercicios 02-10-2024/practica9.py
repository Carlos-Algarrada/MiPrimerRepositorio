#Escribir un programa para una empresa que tiene salas de juegos para todas las
#edades y quiere calcular de forma automática el precio que debe cobrar a sus
#clientes por entrar. El programa debe preguntar al usuario la edad del cliente y
#mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar gratis,
#si tiene entre 4 y 18 años debe pagar 5€ y si es mayor de 18 años, 10€.

print("Bienvenido a la sala de juego Balma Level Up")

edad = int(input("Introduce tú edad: "))

if edad<4:
    print("Entras gratis.")
elif (edad== 4 or edad <=17):
    print("Tienes que pagar 5€")
else:
    print("Tienes que pagar 10€") 
    
