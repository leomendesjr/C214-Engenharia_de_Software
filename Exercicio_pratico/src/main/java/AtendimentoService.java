public interface AtendimentoService {
    public String busca(String nome);

    public boolean validacaohorarioDeAtendimento(int horario);

    public boolean validaoperiodoDeAtendimento(String periodo);
}
