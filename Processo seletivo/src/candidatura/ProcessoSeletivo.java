package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        System.out.println( "imprimindo selecionados");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("candidato " + indice + candidatos[indice]);
        }
    }



    static void selecaoCandidatos(){

        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        int candidatosSelecionados =0;
        int candidatoAtual=0;
        double salarioBase=2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato +" quer receber esse salario" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("o candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
            
            
        }
        


    }
        

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1900, 2100);
    }



    /**
     * 
     */
    static void analisarCadidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("lIGAR PARA O CANDIDATO");}
           
            else if( salarioBase == salarioPretendido)
            System.out.println("Ligar para fazer contra proposta");

            else {
            System.out.println("Aguardar outras candidaturas");    

            }
      
        
    }
    
}
