package br.com.test;

import br.com.main.batalha.Batalha;
import br.com.main.ninja.Ninja;
import br.com.main.ninja.jutsu.Jutsu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatalhaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakraParaAtacar(){
        Jutsu rasengan = new Jutsu(5, 10);
        Ninja naruto = new Ninja("Naruto",rasengan);

        Jutsu caixaoDeAreia = new Jutsu(5, 8);
        Ninja gaara = new Ninja("Gaara", caixaoDeAreia);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(naruto, gaara);

        Assertions.assertSame(naruto, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assertions.assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu genjutsu = new Jutsu(5, 0);
        Ninja itachi = new Ninja("Itachi",genjutsu);

        Jutsu caixaoDeAreia = new Jutsu(5, 8);
        Ninja gaara = new Ninja("Gaara", caixaoDeAreia);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(itachi, gaara);

        Assertions.assertSame(itachi, ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu genjutsu = new Jutsu(5, 100);
        Ninja naruto = new Ninja("Naruto",genjutsu);

        Jutsu caixaoDeAreia = new Jutsu(5, 8);
        Ninja itachi = new Ninja("Itachi", caixaoDeAreia);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(naruto, itachi);

        Assertions.assertSame(itachi, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        Jutsu genjutsu = new Jutsu(5, 10);
        Ninja naruto = new Ninja("Naruto",genjutsu);

        Jutsu caixaoDeAreia = new Jutsu(5, 10);
        Ninja gaara = new Ninja("gaara", caixaoDeAreia);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(naruto, gaara);

        Assertions.assertSame(naruto, ninjaVencedor);
    }
    
}
