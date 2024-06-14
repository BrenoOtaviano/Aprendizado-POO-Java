import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, (int) 10.5, 5, "nada");
        Gato gato1 = new Gato("Felix", "Preto", 10);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);


        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

    }
}