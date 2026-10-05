public class Gato extends Animal {
    
    private boolean aceitaOutrosAnimais;

    //Construtor 
    public Gato(boolean aceitaOutrosAnimais, String nome, String cor, String raca, int idade, String sexo, boolean adotado) {
        super(nome, cor, raca, idade, sexo, adotado);
        this.aceitaOutrosAnimais = aceitaOutrosAnimais;
    }

    //Indica se o animal convive bem com outros animais. Retorna 'true' caso seja verdadeiro, 'false' caso seja falso
    public boolean isAceitaOutrosAnimais() {
        return aceitaOutrosAnimais;
    }

    //Define se o animal aceita conviver com outros animais
    public void setAceitaOutrosAnimais(boolean aceitaOutrosAnimais) {
        this.aceitaOutrosAnimais = aceitaOutrosAnimais;
    }

    //Sobrescreve o método emitirSom da superclasse
    @Override 
    public void emitirSom(){
        System.out.println("Miau!");
    }
}
