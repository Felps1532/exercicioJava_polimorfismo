public class Lobo extends Criatura {
    private int velocidade;

    public Lobo(String nome, int vida, int ataque, int defesa, int velocidade) {
        super(nome, vida, ataque, defesa);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public void mostrarStatus() {
        System.out.println(
                "Criatura [nome=" + getNome() + ", vida=" + getVida() + ", ataque=" + getAtaque() + ", defesa="
                        + getDefesa() + " velocidade=" + this.velocidade + "]");
    }

    @Override
    public void atacarCriatura(Criatura alvo) {
        int dano;
        if (this.velocidade >= 8) {
            dano = (getAtaque() + 3) + alvo.getDefesa();
        } else {
            dano = getAtaque() - alvo.getDefesa();
        }

        if (dano <= 1) {
            dano = 1;
        }

        alvo.setVida(getVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}
