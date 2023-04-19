package pokemonsimulator;

public class Batalha {
   
    private int meuPokemonHP;
    private int outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;
   
    public void meuPokemon(String nome, int vida) {
        this.meuPokemonNome = nome;
        this.meuPokemonHP = vida;
    }
   
    public void outroPokemon(String nome, int vida) {
        this.outroPokemonNome = nome;
        this.outroPokemonHP = vida;
    }
   
    public String startBattle() {
       
        if (this.meuPokemonHP > this.outroPokemonHP) {
            return this.meuPokemonNome;
        } else if (this.outroPokemonHP > this.meuPokemonHP) {
            return this.outroPokemonNome;
        } else {
            return null;
        }
    }
}
