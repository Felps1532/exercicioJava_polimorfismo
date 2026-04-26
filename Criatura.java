public class Criatura {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Criatura(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public boolean estaViva() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void mostrarStatus() {
        System.out.println(
                "Criatura [nome=" + nome + ", vida=" + vida + ", ataque=" + ataque + ", defesa=" + defesa + "]");
    }

    public void atacarCriatura(Criatura alvo) {
        int dano = ataque - alvo.getDefesa();
        if (dano < 1) {
            dano = 1;
        }
        alvo.setVida(alvo.getVida() - dano);
    }
}