#Dibujar un triangulo de asteriscos con altura N

# El ejercicio solicita leer un numero entero del teclado 
# para dibujar un triangulo de asteriscos

# Se deben definir al menos 3 subprogramas

# Ejemplo de Output: Triangulo de altura 4

# *
# ***
# *****
# ******
def comprobar(numero):
    if numero <= 0 :
        return print("Porfavor un numero entero")
    else:  
        return numero
    
def triangulo(numero):
    for i in range (numero+1):
        # el 2 * i-1 es para que salga escalonado y 
        # para que salga en impar y escalonado multiplica por 2 la i y le resta 1
        #por ejemplo 2* 1 -1 = 2-1 = *
        #Por ejemplo 2*2 -1 = 4-1 = ***
          
        print ("*" * (2* i - 1))
        
def main ():
    numero = int(input("Dime un número entero: "))
    comprobar(numero)
    triangulo (numero)

main ()
