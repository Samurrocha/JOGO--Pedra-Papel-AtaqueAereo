/*
*ataque vence todos
*pedra vence somente papel
*papel perde todos
*/

//digite primeiro quatas rodadas serão jogadas, logo após escreva oq cada jogador irá jogar

import java.util.*;

public class TesteClass2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
        
// Solução do problema
        
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
            else if (jogador2.equalsIgnoreCase("ataque")) System.out.println(  "jogador 2 venceu"                );
            else if (jogador2.equalsIgnoreCase("papel")) System.out.println(  "jogador 2 perdeu"                );
            else if (jogador1.equalsIgnoreCase("papel")) System.out.println(  "jogador 1 perdeu"                );
            else System.out.println(  "Sem ganhador"  );
        }
    }
}

/*

Ataque
Ataque




*/
