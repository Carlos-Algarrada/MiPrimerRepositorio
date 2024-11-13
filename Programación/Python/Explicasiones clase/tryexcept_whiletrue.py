while True:
    try:
        n1 = int(input("Escribe un n: "))
        n2 = int(input("escribe otro n: "))
#round sirve para redondear el número  
        print (f"El res es {round (n1/n2)}")
        break
    except ValueError:
        print(f"Nº no introducido.")
#ZeroDivisionError sirve para cuando intentas dividir por 0
    except ZeroDivisionError:
        print(f"No se puede dividir por 0.")