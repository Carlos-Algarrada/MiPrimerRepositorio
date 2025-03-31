def raiz_n_esima(numero, n):
    """
    Calcula la n-ésima raíz de un número.

    Parámetros:
    numero (float): El número del cual se quiere calcular la raíz.
    n (int): El índice de la raíz.

    Devuelve:
    float: La n-ésima raíz del número.

    Ejemplo:
    >>> raiz_n_esima(27, 3)
    3.0

    Advertencias:
    - Si n es 0, lanza un ValueError ya que no se puede calcular la raíz 0-ésima.
    - Si el número es negativo y n es par, el resultado será un número complejo.

    Notas:
    - Este cálculo utiliza potencias fraccionarias para calcular la raíz.
    """
    if n == 0:
        raise ValueError("No se puede calcular la raíz 0-ésima.")
    return numero ** (1 / n)
