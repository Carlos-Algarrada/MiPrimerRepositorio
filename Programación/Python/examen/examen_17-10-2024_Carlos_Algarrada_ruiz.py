''' 
Desarrolla un porgrama en python que permita gestionarlos 
pedidos de una pizzeria durante un día. El programa debe permitir 
almacenar información sobre los pedidios y proporcionar funiconalidades 
para la gestión de los mismos
def inicializar_pizzeria()
def agregar_pedido()
def eliminar_pedido()
def buscar_pedido_por_nombre()
def ingrediente_preferido()
def mostrar_pedidos()
'''
pizzeria={
    "nombre":0,
    "telefono":0,
    "numero_pedido":0,
    "numero_ingredientes": 0,
    "lista-pedidos":[]
}
lista_pedido = []
def inicializar_pizzeria(n):
    n= n.clear()

def agregar_pedido(n):
    num_pedido = 0
    nombre = input("Dime tú nombre: ")
    telefono = input("Dime tú numero de telefono: ")
    num_pedido +=1
    n["nombre"] = nombre
    n["telefono"]= telefono
    n["numero_pedido"]= num_pedido
    
    while True:
        print("Estos son nuestros ingredientes")
        print("0: Tomate")
        print("1: Queso")
        print("2: Nata")
        print("3: Cebolla")
        print("4: Pollo")
        print("5: Huevo")
        print("6: Salami")
        print("7: Anchoa")
        print("8: Bacon")
        print("9: Gamba")
        print("q: Para salir")
        num=input("Dime un ingrediente")
        if num == "q":
            break
        lista_pedido.append(num)
    n["lista-pedidos"].append(num)
    return n
def eliminar_pedido(n):
    x= input("Dime el numero de pedido")
    eliminar = n.remove(x)

def buscar_pedido_por_nombre(n):
   nombre = input("Dime el nombre:")
   if n["nombres"] == nombre:
       print (n)
    
def ingrediente_preferido(n):
    preferido = lista_pedido.count()
    
def mostrar_pedidos(n):
    print (n)

def main():
    print("¿Que quieres hacer?")
    print("1. Inicializar la pizzeria")
    print("2. Agregar un pedido")
    print("3. Eliminar un pedido")
    print("4. Buscar pedido por nombre")
    print("5. Ingrediente preferido")
    print("6. Mostrar los pedidos")
    print("0. Para salir")
while True:
    main()
    numero = int(input("Dime un número: "))
    if numero == 1:
        inicializar_pizzeria(pizzeria)
    elif numero == 2:
        agregar_pedido(pizzeria)
    elif numero == 3:
        eliminar_pedido(pizzeria)
    elif numero == 4:
        buscar_pedido_por_nombre(pizzeria)
    elif numero == 5:
        ingrediente_preferido(pizzeria)
    elif numero == 6:
        mostrar_pedidos(pizzeria)
    elif numero == 0:
        break
    else:
        print("Usa un número que este en la lista")