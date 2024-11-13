''' Programa que lea de teclado una letra minúscula (suponemos que la entrada de datos es correcta), y escrib la letra mayúscula
correspondiente a la letra mnúscula leida previamente'''
#Para usar el while True: tiene que estar True con la t en mayuscula
while True:  
    try:   
        letra = input ("Escribe una letra minuscula: ")
        #Comprobar si hay mas de letra
        if len(letra) !=1:
            raise ValueError("La entrada debe ser una única letra")
        #Comprobar si es una letra
        if not letra.isalpha():
            raise ValueError ("La entrada debe ser una letra")
        #Comprobar si es mayuscula
        if letra.isupper():
            raise ValueError ("Introduce una minuscula")
        else:
            print (f"La letra mayuscula correspondiente es: {letra.upper()}")
            #break sirve para romper el programa yque se salga del while
            break
    except ValueError as e:
        print (f"error: {e}")