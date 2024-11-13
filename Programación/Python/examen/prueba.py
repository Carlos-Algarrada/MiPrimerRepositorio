# Inicialización de la estructura de la pizzería
pizzeria = {
    "pedidos": [] }

# Función para inicializar la pizzería, vaciando la lista de pedidos
def inicializar_pizzeria():
    pizzeria["pedidos"] = []
    print("Pizzería inicializada. Lista de pedidos vaciada.")

# Función para agregar un nuevo pedido
def agregar_pedido():
    pedido = {}
    pedido["numero_pedido"] = len(pizzeria["pedidos"]) + 1
    pedido["nombre"] = input("Dime tu nombre: ")
    pedido["telefono"] = input("Dime tu número de teléfono: ")
    
    print("Estos son nuestros ingredientes:")
    ingredientes = ["Tomate", "Queso", "Nata", "Cebolla", "Pollo", "Huevo", "Salami", "Anchoa", "Bacon", "Gamba"]
    for idx, ing in enumerate(ingredientes):
        print(f"{idx}: {ing}")
    print("q: Para salir")

    lista_ingredientes = []
    while True:
        num = input("Dime un ingrediente (o 'q' para finalizar): ")
        if num == "q":
            break
        elif num.isdigit() and int(num) in range(len(ingredientes)):
            lista_ingredientes.append(ingredientes[int(num)])
        else:
            print("Por favor, elige un número válido o 'q' para salir.")

    pedido["ingredientes"] = lista_ingredientes
    pizzeria["pedidos"].append(pedido)
    print("Pedido agregado con éxito.")

# Función para eliminar un pedido por número
def eliminar_pedido():
    num_pedido = int(input("Dime el número del pedido a eliminar: "))
    for pedido in pizzeria["pedidos"]:
        if pedido["numero_pedido"] == num_pedido:
            pizzeria["pedidos"].remove(pedido)
            print("Pedido eliminado.")
            return
    print("Pedido no encontrado.")

# Función para buscar un pedido por el nombre del cliente
def buscar_pedido_por_nombre():
    nombre = input("Dime el nombre del cliente: ")
    pedidos_encontrados = [pedido for pedido in pizzeria["pedidos"] if pedido["nombre"].lower() == nombre.lower()]
    if pedidos_encontrados:
        for pedido in pedidos_encontrados:
            print(pedido)
    else:
        print("No se encontró ningún pedido para ese nombre.")

# Función para encontrar el ingrediente más popular entre todos los pedidos
def ingrediente_preferido():
    ingredientes = []
    for pedido in pizzeria["pedidos"]:
        ingredientes.extend(pedido["ingredientes"])
    if ingredientes:
        preferido = max(set(ingredientes), key=ingredientes.count)
        print(f"El ingrediente más popular es: {preferido}")
    else:
        print("No hay ingredientes registrados aún.")

# Función para mostrar todos los pedidos
def mostrar_pedidos():
    if pizzeria["pedidos"]:
        for pedido in pizzeria["pedidos"]:
            print(pedido)
    else:
        print("No hay pedidos registrados.")

# Menú principal
def main():
    while True:
        print("\n¿Qué quieres hacer?")
        print("1. Inicializar la pizzería")
        print("2. Agregar un pedido")
        print("3. Eliminar un pedido")
        print("4. Buscar pedido por nombre")
        print("5. Ingrediente preferido")
        print("6. Mostrar los pedidos")
        print("0. Salir")

        opcion = input("Elige una opción: ")
        if opcion == "1":
            inicializar_pizzeria()
        elif opcion == "2":
            agregar_pedido()
        elif opcion == "3":
            eliminar_pedido()
        elif opcion == "4":
            buscar_pedido_por_nombre()
        elif opcion == "5":
            ingrediente_preferido()
        elif opcion == "6":
            mostrar_pedidos()
        elif opcion == "0":
            print("Saliendo del programa.")
            break
        else:
            print("Por favor, elige una opción válida.")

# Ejecutar el programa
main()
