package atividadePDS;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
    	
        	
        Pessoa pessoa = new Pessoa("Fabricio Araújo",21);
        Pessoa pessoa1 = new Pessoa("Igor Chinayder",20);

        // Exibindo as informações dos estudantes
        
       
        pessoa.exibirInformacoes();
        pessoa1.exibirInformacoes();
    }
}