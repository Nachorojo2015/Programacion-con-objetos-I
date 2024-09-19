class Cubo:
    def __init__(self, longitud_lado):
        """Inicializa el objeto Cubo e indica los valores de los atributos"""
        if longitud_lado <= 0:
            return ValueError("El valor de la longitud lado debe ser mayor a 0")
        
        self.longitud_lado = longitud_lado
        self.caras = 6
        self.area = pow(self.longitud_lado, 2) * self.caras
        self.volumen = pow(self.longitud_lado, 3)

    def obtener_lado(self):
        """Devuelve el lado del cubo"""
        return self.longitud_lado
    

    def cambiar_lado(self, longitud_lado):
        """Cambia el lado del cubo"""
        if (longitud_lado <= 0):
            return ValueError("El valor de la longitud lado debe ser mayor a 0")
        
        self.longitud_lado = longitud_lado
    
    def obtener_area(self):
        """Devuelve el area del cubo"""
        return self.area
    
    def cambiar_area_cara(self, area_cara):
        """Cambia el area del cubo"""
        if area_cara <= 0:
            return ValueError("El valor del area debe ser mayor a 0")
        
        self.area = area_cara
    
    def obtener_volumen(self):
        """Devuelve el volumen del cubo"""
        return self.volumen
    
    def cambiar_volumen(self, volumen):
        """Cambia el volumen del cubo"""
        if (volumen <= 0):
            return ValueError("El valor del volumen debe ser mayor a 0")
        
        self.volumen = volumen

cubo = Cubo(12)
print(cubo.obtener_lado())
print(cubo.obtener_area())