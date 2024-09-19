"""Modela un punto en el plano"""

import math;

class Punto: 
    """Modela un punto de coordenadas x e y"""

    def __init__(self, x, y):
        self.__x = x
        self.__y = y

    def get_x(self) -> int:
        """Retorna la coordenada del punto x"""
        return self.__x
    
    def get_y(self) -> int:
        """Retorna la coordenada del punto y"""
        return self.__y
    
    def mostrar_punto(self): 
        return ""
    
    def esta_sobre_el_eje_x(self) -> bool:
        """Devuelve true según o no el punto este sobre el eje x"""
        return self.get_y() == 0
    
    def esta_sobre_el_eje_y(self) -> bool:
        """Devuelve un punto según o no el punto este sobre el eje y"""
        return self.get_x() == 0
    
    def es_el_origen(self) -> bool:
        return self.esta_sobre_el_eje_x() and self.esta_sobre_el_eje_y()
    
    def distancia_al_origen(self):
        """Devuelve la distancia desde al punto al origen de coordenadas"""
        return math.sqrt(pow(self.__x, 2) + pow(self.__y, 2))
    
    def distancia_entre_dos_puntos(self, otro):
        """Devuelve la distancia entre dos puntos"""
        return math.sqrt(pow(self.__x - otro.get_x(), 2) + pow(self.__y - otro.get_y(), 2))
    
    def desplazar_en_x(self, d_en_x):
        """"Desplaza x según el valor del parametro"""
        self.__x = d_en_x

    def desplazar_en_y(self, d_en_y):
        """Desplaza y según el valor del parametro"""
        self.__y = d_en_y

    def desplazar_en_ambas_direcciones(self, d_en_x, d_en_y):
        self.desplazar_en_x(d_en_x)
        self.desplazar_en_y(d_en_y)

    def __str__(self) -> str:
        """Devuelve un string con las coordenadas del punto en forma de par ordenado"""
        return "( " + str(self.get_x()) + ", " + str(self.get_y()) + " )"

    def __eq__(self, other) -> bool:
        return self.get_x() == other.get_x() and self.get_y == other.get_y()
    

