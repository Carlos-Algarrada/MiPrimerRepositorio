class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def mostrar_informacion(self):
        """Muestra la información básica del empleado.
        
        Args: Nombre
              Edad
              Salario
        """
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: ${self.salario:.2f}"

    def aumentar_salario(self, porcentaje):
        """Aumenta el salario del empleado en un porcentaje dado.
        Args: Si el porcentaje es mayor de 0

        Return: Se suma al salario, el salario multiplicado por el porcentaje
        """
        if porcentaje > 0:
            self.salario += self.salario * (porcentaje / 100)

    def es_mayor_de_edad(self):
        """Verifica si el empleado es mayor de edad.
        
        Args: Si el trabjador es mayor de 18

        Return: Se comprueba si es mayor o igual a 18
        """
        return self.edad >= 18

class Gerente(Empleado):
    def __init__(self, nombre, edad, salario, departamento):
        super().__init__(nombre, edad, salario)
        self.departamento = departamento

    def asignar_departamento(self, nuevo_departamento):
        """Asigna un nuevo departamento al gerente."""
        self.departamento = nuevo_departamento

    def mostrar_informacion(self):
        """Muestra información completa del gerente, sobrescribiendo el método de Empleado."""
        info_base = super().mostrar_informacion()
        return f"{info_base}, Departamento: {self.departamento}"
