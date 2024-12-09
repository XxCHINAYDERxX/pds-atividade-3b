package atividadePDS;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
   
    // Getters
    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
        return idade;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
    
}