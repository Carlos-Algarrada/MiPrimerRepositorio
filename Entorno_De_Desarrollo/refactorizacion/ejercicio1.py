def calculadora_de_salario(e, h):
    s = e * h
    print(f"Total salary: {s}")

precio_por_horas = 15
horas_trabjadas = 40
calculadora_de_salario(precio_por_horas, horas_trabjadas)

def process_ages(ages):
    total = 0
    for edad in ages:
        if edad > 0:
            total += edad
    average = total / len(ages)
    print(f"Total: {total}, Average: {average}")