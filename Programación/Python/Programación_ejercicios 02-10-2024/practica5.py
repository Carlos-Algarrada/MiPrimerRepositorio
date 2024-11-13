#Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas.
#Suele hacer venta por correo y la empresa de logística les cobra por peso de cada
#paquete así que deben calcular el peso de los payasos y muñecas que saldrán en
#cada paquete a demanda. Cada payaso pesa 112 g y cada muñeca 75 g. Escribir un
#programa que lea el número de payasos y muñecas vendidos en el último pedido y
#calcule el peso total del paquete que será enviado.

payasos = int (input("¿Cuantos Payasos se han vendido en el último pedido? "))
munecas = int (input("¿Cuantas muñecas se han vendido en el último pedido? "))
payasos = 112*payasos
munecas = 75*munecas
peso = payasos + munecas
if payasos <1000:
    print ("El peso de los payasos es: ", payasos,"gramos" )
else:
    payasos1 = payasos/1000
    print ("El peso de los payasos es: ", payasos1,"kilos" )

if munecas <1000:
    print ("El peso de las muñecas es: ", munecas,"gramos" )
else:
    munecas1 = munecas/1000
    print ("El peso de las muñecas es: ", munecas1,"kilos" )

if peso <1000:
    print ("El peso total del paquete es:", peso, "Gramos")
else:
    peso = peso/1000
    print ("El peso total del paquete es:", peso, "Kilos")
    