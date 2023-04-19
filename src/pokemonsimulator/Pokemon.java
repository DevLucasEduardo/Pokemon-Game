package pokemonsimulator;

public class Pokemon {

    private String nome;
    private final String tipo;
    private final int level;
    private int vida = 1000;
    private int ataque;
    private int defesa;
   
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaBonus();
    }
   
    private void calculaAtributos() {
        switch (this.tipo) {
            case "Fogo" -> {
                this.vida -= 80;
                this.ataque = 75;
                this.defesa = 10;
            }
            case "Água" -> {
                this.vida -=50;
                this.ataque = 65;
                this.defesa = 50;
            }
            case "Planta" -> {
                this.vida += 40;
                this.ataque = 25;
                this.defesa = 30;
            }
            case "Pedra" -> {
                this.vida += 10;
                this.ataque = 45;
                this.defesa = 80;
            }
            default -> {
            }
        }
    }

    private void calculaBonus() {
        this.vida += this.level / 4;
        this.ataque += this.level / 2;
        this.defesa += this.level / 3;
    }
   
    public void imprimePokemon() {
        System.out.println("Nome: " + this.nome + "\nTipo: " + this.tipo +
                "\nLevel: " + this.level + "\nVida: " + this.vida + "\nAtaque: "
                + this.ataque +  "\nDefesa: " + this.defesa + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
   
   
   
}