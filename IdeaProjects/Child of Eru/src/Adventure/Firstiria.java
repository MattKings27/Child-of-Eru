package Adventure;
import Hero.Personagem;
import Hero.CriarHero;

import java.util.Scanner;

public class Firstiria extends CriarHero {

    public Firstiria(String nome, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, String classe) {
        super(nome, forca, destreza, constituicao, inteligencia, sabedoria, carisma, classe);
    }

    public iniciarAventura() {

        CriarHero heroi1 = new CriarHero("Jogador", 8, 8, 8, 8, 8, 8, "Prisioneiro");

        System.out.println(heroi1.getVida());

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nA aventura se inicia, após a confirmação dos outros oficiais, o guarda vira para você e os demais prisioneiros com imponência e diz:");
        System.out.println("Sigam-me, prisioneiros! Hoje é seu último dia de vida, mas antes disso, todos terão direito a uma última refeição");
        System.out.println();
        System.out.println("O que você faz?");
        System.out.println("\n");
        System.out.println("1 - Seguir o guarda");
        System.out.println("2 - Atacar o guarda");
        System.out.println("3 - Tentar fugir\n");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Você segue o guarda obedientemente até o local das refeições\n");
                break;
            case 2:
                System.out.println("Você percebe suas mãos amarradas... pode ser difícil atacar o guarda assim");
                System.out.println("1 - Tentar desatar as mãos sem que ninguém perceba");
                System.out.println("2 - Tentar atacar o guarda mesmo assim");
                System.out.println("3 - Desistir e seguir o guarda\n");

                break;
            case 3:
                System.out.println("Existem muitos guardas e cidadãos observando a cena, pode ser difícil escapar dali, mas não impossível.");
                System.out.println("À sua esquerda, você percebe uma carroça sendo descarregada, talvez dê para correr, saltar nela e então para fora dos muros da cidade");
                System.out.println("1 - Correr com toda velocidade e tentar saltar da carroça para fora do muro");
                System.out.println("2 - Tentar correr pela estrada da cidade passando por todos");
                System.out.println("3 - Desistir e seguir o guarda\n");
                break;


        }

    }
}