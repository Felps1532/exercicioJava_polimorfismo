public class App {
    public static void main(String[] args) {
        Dragao drako = new Dragao("Drako", 100, 50, 50, 35);
        Lobo lobinho = new Lobo("Lobinho", 45, 30, 25, 10);
        Golem golem = new Golem("Golem", 70, 35, 50, 80);

        Criatura criaturas[] = new Criatura[3];

        criaturas[0] = drako;
        criaturas[1] = lobinho;
        criaturas[2] = golem;

        System.out.println("--------- STATUS INICIAL ---------");
        for (int i = 0; i < criaturas.length; i++) {
            criaturas[i].mostrarStatus();
        }
        System.out.println("--------- FIM STATUS ---------");

        System.out.println("--------- BATALHA ---------");
        for (int i = 0; i < criaturas.length; i++) {
            for (int j = 1; j < criaturas.length; j++) {
                criaturas[i].atacarCriatura(criaturas[j]);

                if (j == criaturas.length - 1) {
                    j = 0;
                }
            }
        }
        System.out.println("--------- FIM BATALHA ---------");
    }
}
