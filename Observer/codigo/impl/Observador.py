from Observer.codigo.interfaces.iObservador import Observador
from Observer.codigo.impl.Observavel import observavel

class observador(Observador):

    def __init__(self, id):
        self.id = id

    def update(self, frase):
        print("Observador: " + str(self.id))
        print('Quant de palavras: ' + str(frase.quant_palavras))
        print('Quant de palavras com quant de caract pares: ' + str(frase.quant_pares))
        print('Quant de palavras com a primeira letra maiuscula: ' + str(frase.quant_maiuscula))
        print('-------------------------------------------------------------------------')