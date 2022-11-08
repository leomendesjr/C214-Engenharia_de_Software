from .codigo.impl.Observador import observador
from .codigo.impl.Observavel import observavel

if __name__ == "__main__":

    user = observavel()

    obs1 = observador(1)
    obs2 = observador(2)
    obs3 = observador(3)

    user.registra(obs1)
    user.registra(obs2)
    user.registra(obs3)

    user.receba("O Vascão da Grana chegou")
