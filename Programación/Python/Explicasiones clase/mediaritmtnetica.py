'''Programa que calcule y escriba la media aritmética de 3 números enteros leidos de teclado'''

#Map: hace lo que le digas las veces que haga falta mas o menos.
#.split : sirve para separar cosas.

n1, n2 ,n3 = map(int, input("Dame 3 números separados por espacios: ").split())

print(f"Los números son {n1}, {n2}, {n3}")

media = float(n1+n2+n3) / 3

#Round: redondea el número a 2 decimales.
#f en un print: te sirve para poder escribir sin necesidad de entre comillar todo el rato
print(f"La media es{round(media,2)}")