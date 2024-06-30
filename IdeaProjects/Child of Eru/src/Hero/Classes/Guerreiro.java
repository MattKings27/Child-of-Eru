package Hero.Classes;

import Hero.Personagem;
import Hero.LevelUp;

public class Guerreiro extends Personagem {
    private int gritoDeGuerra;
    private int segundoVento;
    private int doubleStrike;
    private int aimWeakness;

    public Guerreiro(String nome, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, String classe) {
        super(nome, forca, destreza, constituicao, inteligencia, sabedoria, carisma, classe);


        this.gritoDeGuerra = 1;
    }


    public void usarGritoDeGuerra() {
        if(gritoDeGuerra > 0) {
            System.out.println("Por honra e glória!\n" + this.getNome() + " usou Grito de Guerra!");
            setForca(getForca() + 1);
            setVida(getVida() + 2);
            gritoDeGuerra--;
        } else {
            System.out.println("Habilidade indisponível.. Descanse entre combates para usar novamente");
        }

    }
}
