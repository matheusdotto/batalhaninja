package br.com.main.ninja.jutsu;

import lombok.Data;

@Data
public class Jutsu {

    private int jutsuChakra;
    private int jutsuDano;

    public Jutsu(int custo, int dano) {
        this.jutsuChakra = custo;
        this.jutsuDano = dano;
        
        if(this.jutsuDano > 10) {
            this.jutsuDano = 10;
        }

        if(this.jutsuChakra > 5) {
            this.jutsuChakra = 5;
        }
    }
}
