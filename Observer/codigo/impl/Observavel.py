from Observer.codigo.interfaces.iObservavel import texto

class observavel(texto):
    
    def __init__(self):
        self.quant_palavras = 0
        self.quant_pares = 0
        self.quant_maiuscula = 0
        self.list_observador = []

    def registra(self, obs):
        self.list_observador.append(obs)

    def remove(self, obs):
        if obs in self.list_observador:
            self.list_observador.remove(obs)

    def notifica(self):
        for i in self.list_observador:
            i.update(self)

    def split_frase(self, palavra):
        return(len(palavra.split(" ")))

    def cont_par(self, palavra):
        cont = 0
        for i in palavra.split(" "):
            if (len(i) % 2 == 0):
                cont += 1
        return cont    

    def cont_maius(self, palavra):
        cont_m = 0
        for i in palavra.split(" "):
            if i[0].isupper(): 
                cont_m += 1
        return cont_m  

    def receba(self, palavra):
        self.quant_palavras = self.split_frase(palavra)
        self.quant_pares = self.cont_par(palavra)
        self.quant_maiuscula = self.cont_maius(palavra)

        self.notifica()
