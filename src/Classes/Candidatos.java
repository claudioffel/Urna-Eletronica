package Classes;

public class Candidatos {
//criamos atributos de nome e partido, que vai ser cadastrados no arraylist, 
    public String nome;
    public String partido;
    
    public Candidatos(String nome, String partido) {// criei esse método construtor, com os parametros usados nos atributos, que vai ser responsavel pro criar objeto em memoria e instanciar a classe
        this.nome = nome;
        this.partido = partido;      
    }

    public String getNome() {//criamos os metodos getters e setters 
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public static void add(Candidatos candidato1) {//é o metodo construtor dos candidados nas telas das urnas
        
    }
    
    @Override
    public String toString() {//ensinando a classe candidatos a se formatar como string, toda vez que for escrever um objeto do tipo "candidatos" eu vou retornar o atributo nome e partido
        return nome + " ; " + partido;
    }
  
}
