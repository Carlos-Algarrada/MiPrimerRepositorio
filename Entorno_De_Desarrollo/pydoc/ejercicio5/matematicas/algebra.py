def resolver_ecuacion_lineal(a, b):
    """
    Resuelve una ecuación lineal de la forma ax + b = 0.
    
    Parámetros:
    a (float): Coeficiente de x.
    b (float): Término independiente.
    
    Devuelve:
    float: La solución de la ecuación.
    
    Lanza:
    ValueError: Si a es igual a 0.
    """
    if a == 0:
        raise ValueError("El coeficiente a no puede ser cero.")
    return -b / a

def suma_aritmetica(a, b):
    """
    Calcula la suma de dos números.
    
    Parámetros:
    a (float): Primer número.
    b (float): Segundo número.
    
    Devuelve:
    float: La suma de los dos números.
    """
    return a + b
