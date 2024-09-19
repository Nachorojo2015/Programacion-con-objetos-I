import math
import punto

class Circulo:

    """Modela un circulo a partir de su radio y su centro"""

    def __init__(self, radio, x_centro, y_centro):
        if radio < 0:
            raise ValueError("El radio debe ser positivo")
        self.__radio = radio
        self.__centro = punto.Punto(x_centro, y_centro)