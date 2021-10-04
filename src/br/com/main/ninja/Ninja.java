package br.com.main.ninja;

import br.com.main.ninja.jutsu.Jutsu;
import lombok.Data;

import static java.lang.System.*;

@Data
public class Ninja {

    private String nome;
    private int chakra = 100;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu) {
        this.nome = nome;
        this.jutsu = jutsu;

    }

    public void atacar(Ninja ninjaOponente) {

        this.chakra = chakra - (jutsu.getJutsuChakra());

        ninjaOponente.chakra = ninjaOponente.chakra - (jutsu.getJutsuDano());

        receberGolpe(ninjaOponente);

        out.println("Ninja Oponente: " + ninjaOponente.getNome() + '\n' +
                "Chakra : " + ninjaOponente.getChakra());

        if (this.chakra <= 0) {
            this.chakra = 0;
        }
    }

    public void receberGolpe(Ninja ninjaOponente) {

        this.chakra = chakra - (ninjaOponente.jutsu.getJutsuDano());
    }

}
