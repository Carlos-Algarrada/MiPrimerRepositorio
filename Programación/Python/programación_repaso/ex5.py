'''5. Ejercicio: Crear una lista de ingredientes para hacer una pizza
Escribe un programa que permita al usuario seleccionar ingredientes de una lista de
ingredientes predefinidos para hacer una pizza. El usuario puede elegir hasta 5
ingredientes, y al final el programa debe mostrar los ingredientes seleccionados.
'''
ingredientes_disp ["Tomate","Queso","Nata","Cebolla","Pollo"]

ingredientes_sel = []

print("ingredientes disponibles:", {ingredientes_sel})

while len(ingredientes_sel) <5:
    sel = int(input("Selecciona el número del ingrediente (0-4)"))

    if sel< 0 or sel >9:
        print("Número no válido. Debe estar entre 0 y 4")
    elif ingredientes_disp[sel] in ingredientes_sel:
        print(f"Ya lo has seleccionado{ingredientes_dip[sel]} elige otro")
    else:
        ingredientes_sel.append(ingredientes_disp [sel])
        print (f"Has seleccionado: {ingredientes_disp[sel]}")

print(f"Los ingredientes seleccionados son: {ingredientes_sel}")
