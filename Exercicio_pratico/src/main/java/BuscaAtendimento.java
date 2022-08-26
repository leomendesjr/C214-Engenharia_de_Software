import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {

    AtendimentoService atendimentoService;

    public BuscaAtendimento(AtendimentoService atendimentoService){
        this.atendimentoService = atendimentoService;
    }

    public Atendimento buscaAtendimento(String nome){

        //Faz uma busca pelo service com o ID 10
        String atendimentoJson = atendimentoService.busca(nome);

        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        return new Atendimento(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsInt(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean validacaohorarioDeAtendimento(int horario){
        boolean validacaohorario = atendimentoService.validacaohorarioDeAtendimento(horario);

        if(validacaohorario){
            return true;
        }
        else return false;
    }

    public boolean validaoperiodoDeAtendimento(String periodovalidacao){
        boolean validacaoperiodo = atendimentoService.validaoperiodoDeAtendimento(periodovalidacao);

        if(validacaoperiodo){
            return true;
        }
        else return false;
    }
}
