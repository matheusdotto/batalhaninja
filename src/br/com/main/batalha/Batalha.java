package br.com.main.batalha;

import br.com.main.ninja.Ninja;

import static java.lang.System.*;

public class Batalha {

    Ninja vencedor;

    public Ninja lutar(Ninja ninjaUm, Ninja ninjaDois) {

        while (ninjaUm.getChakra() > 0 || ninjaDois.getChakra() > 0) {

            if (ninjaUm.getNome().equals("Itachi")) {
                vencedor = ninjaUm;
                out.println("O ninja vencedor é: " + vencedor.getNome());
                return vencedor;
            } else if (ninjaDois.getNome().equals("Itachi")) {
                vencedor = ninjaDois;
                out.println("O ninja vencedor é: " + vencedor.getNome());
                return vencedor;
            } else {

                out.println("Ninja Atacante: " + ninjaUm.getNome() + '\n' +
                        "Chakra: " + ninjaUm.getChakra());

                ninjaUm.atacar(ninjaDois);

                out.println("Ninja Atacante: " + ninjaDois.getNome() + '\n' +
                        "Chakra: " + ninjaDois.getChakra());
                ninjaDois.atacar(ninjaUm);

                if (ninjaDois.getChakra() <= 0) {
                    vencedor = ninjaUm;
                    out.println("O ninja vencedor é: " + vencedor.getNome());
                } else if (ninjaUm.getChakra() <= 0) {
                    vencedor = ninjaDois;
                    out.println("O ninja vencedor é: " + vencedor.getNome());
                } else if (ninjaUm.getChakra() == 0 && ninjaDois.getChakra() == 0) {
                    vencedor = ninjaUm;
                }
            }
        }
        return vencedor;
    }
}
