public class MockAtendimentoService implements AtendimentoService{
    @Override
    public String busca(String nome) {
        if(nome.equals("douglas")){
            return AtendimentoConst.DOUGLAS;
        }
        else if (nome.equals("fernanda")){
            return AtendimentoConst.FERNANDA;
        }
        return AtendimentoConst.FABIO;
    }

    @Override
    public boolean validacaohorarioDeAtendimento(int horario){
        if(horario<=23 && horario >= 0)
            return true;
        return false;
    }

    @Override
    public boolean validaoperiodoDeAtendimento(String periodo){
        if(periodo.equals("integral") || periodo.equals("noturno") ){
            return true;
        }
        else return false;
    }
}
