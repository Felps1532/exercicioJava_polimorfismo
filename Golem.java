public class Golem extends Criatura {
    private int armadura;

    public Golem(String nome, int vida, int ataque, int defesa, int armadura) {
        super(nome, vida, ataque, defesa);
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    @Override
    public void mostrarStatus() {
        System.out.println(
                "Criatura [nome=" + getNome() + ", vida=" + getVida() + ", ataque=" + getAtaque() + ", defesa="
                        + getDefesa() + " armadura=" + this.armadura + "]");
    }

    @Override
    public void atacarCriatura(Criatura alvo) {
        int dano = (getAtaque() + this.armadura) - alvo.getDefesa();
        if (dano <= 0) {
            dano = 1;
        }
        alvo.setVida(getVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}
