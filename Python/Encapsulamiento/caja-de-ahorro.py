class Caja_de_ahorro:


    def __init__(self, titular) -> None:
        self.__titular = titular
        self.__saldo = 0.0
    
    def obtener_titular(self) -> str:
        return self.__titular
    
    def consultar_saldo(self) -> float:
        return self.__saldo
    
    def depositar(self, monto):
        if monto > 0:
            self.__saldo += monto
        else:
            print("El monto a depositar debe ser mayor a cero")
    
    def extraer(self, monto):
        if monto > 0 and monto <= self.__saldo:
            self.__saldo -= monto
        else:
            print("El monto a extraer debe ser mayor a cero y no superar el saldo en la cuenta")
    
