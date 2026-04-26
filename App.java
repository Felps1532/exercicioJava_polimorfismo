public class App {
    public static void main(String[] args) {
        Dragao drako = new Dragao("Drako", 100, 50, 50, 35);
        Lobo lobinho = new Lobo("Lobinho", 45, 30, 25, 10);
        Golem golem = new Golem("Golem", 70, 35, 50, 80);

        Criatura criaturas[] = new Criatura[3];

        criaturas[0] = drako; // drako ataca lobinho
        criaturas[1] = lobinho; // lobinho ataca golem
        criaturas[2] = golem; // golem ataca drako

        System.out.println("--------- STATUS INICIAL ---------");
        for (int i = 0; i < criaturas.length; i++) {
            criaturas[i].mostrarStatus();
        }
        System.out.println("--------- FIM STATUS ---------");

        System.out.println("--------- BATALHA ---------");
        int j = 1;
        for (int i = 0; i < criaturas.length; i++) {
            criaturas[i].atacarCriatura(criaturas[j]);

            j++;

            if (j == criaturas.length) {
                j = 0;
            }
        }
        System.out.println("--------- FIM BATALHA ---------");
    }
}
