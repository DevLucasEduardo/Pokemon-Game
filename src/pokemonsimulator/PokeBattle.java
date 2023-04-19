package pokemonsimulator;

public class PokeBattle {

    public static void main(String[] args) {
   
        Pokemon pokemon1 = new Pokemon("Poliwrath", "Água", 20);
        Pokemon pokemon2 = new Pokemon("Braixen", "Fogo", 30);
        Batalha batalha = new Batalha();
        batalha.meuPokemon(pokemon1.getNome(), pokemon1.getVida());
        batalha.outroPokemon(pokemon2.getNome(), pokemon2.getVida());
        pokemon1.imprimePokemon();
        pokemon2.imprimePokemon();
        System.out.println(batalha.startBattle());
      
        JFrameInicio jogo = new JFrameInicio();
        
    }
}