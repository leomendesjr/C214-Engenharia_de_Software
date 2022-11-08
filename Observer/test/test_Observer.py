from Observer.codigo.impl.Observador import observador
from Observer.codigo.impl.Observavel import observavel

class TestObs():

    def test_vazia(self):
        Observavel = observavel()

        assert len(Observavel.list_observador) == 0

    def test_com_1(self):

        Observavel = observavel()
        Observador = observador(10)
        Observavel.registra(observador)

        assert len(Observavel.list_observador) == 1    

    def test_quant_palavras(self):

        Observavel = observavel()
        Observavel.receba('Fortnite com os cria')

        assert Observavel.quant_palavras == 4

    def test_quant_maius(self):

        Observavel = observavel()
        Observavel.receba('Fortnite com os cria')

        assert Observavel.quant_maiuscula == 1 