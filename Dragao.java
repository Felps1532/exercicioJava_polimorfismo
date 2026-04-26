public class Dragao extends Criatura {
    private int fogo;

    public Dragao(String nome, int vida, int ataque, int defesa, int fogo) {
        super(nome, vida, ataque, defesa);
        this.fogo = fogo;
    }

    public int getFogo() {
        return this.fogo;
    }

    @Override
    public void mostrarStatus() {
        System.out.println(
                "Criatura [nome=" + getNome() + ", vida=" + getVida() + ", ataque=" + getAtaque() + ", defesa="
                        + getDefesa() + " fogo=" + this.fogo + "]");
    }

    @Override
    public void atacarCriatura(Criatura alvo) {
        int dano;
        if (this.fogo >= 10) {
            dano = (getAtaque() + 6) - alvo.getDefesa();
            fogo -= 10;
        } else {
            dano = getAtaque() - alvo.getDefesa();
        }

        if (dano <= 0) {
            dano = 1;
        }

        alvo.setVida(alvo.getVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}
