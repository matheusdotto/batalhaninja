package br.com.main.batalha;

import br.com.main.ninja.Ninja;

import static java.lang.System.*;

public class Batalha {

    Ninja vencedor;

    public Ninja lutar(Ninja ninjaUm, Ninja ninjaDois) {

        final String ninjaVencedor = "O Ninja vencedor é : ";

        while (ninjaUm.getChakra() > 0 || ninjaDois.getChakra() > 0) {

            if (ninjaUm.getNome().equals("Itachi")) {
                vencedor = ninjaUm;
                out.println(ninjaVencedor + vencedor.getNome());
                return vencedor;
            } else if (ninjaDois.getNome().equals("Itachi")) {
                vencedor = ninjaDois;
                out.println(ninjaVencedor + vencedor.getNome());
                return vencedor;
            } else {

                out.println("Ninja Atacante: " + ninjaUm.getNome() + '\n' +
                        "Chakra: " + ninjaUm.getChakra());

                ninjaUm.atacar(ninjaDois);

                out.println(ninjaVencedor + ninjaDois.getNome() + '\n' +
                        "Chakra: " + ninjaDois.getChakra());
                ninjaDois.atacar(ninjaUm);

                if (ninjaDois.getChakra() <= 0) {
                    vencedor = ninjaUm;
                    out.println(ninjaVencedor + vencedor.getNome());
                    return vencedor;
                } else if (ninjaUm.getChakra() <= 0) {
                    vencedor = ninjaDois;
                    out.println(ninjaVencedor + vencedor.getNome());
                    return vencedor;
                } else if (ninjaUm.getChakra() == 0 && ninjaDois.getChakra() == 0) {
                    vencedor = ninjaUm;
                    return vencedor;
                }
            }
        }
        return vencedor;
    }
}
