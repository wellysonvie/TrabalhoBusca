
package Main;

import Buscas.*;

public class Solucionador {

    @SuppressWarnings("empty-statement")
    public static Solucao largura(int[] entrada){
        
        System.out.println("Busca em largura");
        
        BuscaLargura bl = new BuscaLargura();
        
        long tempoInicio = System.currentTimeMillis();
        Solucao s = bl.buscar(entrada, 100);
        s.tempo = System.currentTimeMillis()-tempoInicio;
        
        return s;
    }
    
    public static Solucao profundidade(int[] entrada){
        
        System.out.println("Busca em profundidade");
        
        int cont = 10;
        BuscaProfundidade bp = new BuscaProfundidade();
        Solucao s = null;
        
        long tempoInicio = System.currentTimeMillis(), tempoFinal = 0;
        while(s == null){
            s = bp.buscar(entrada, cont);
            tempoFinal = System.currentTimeMillis();
            cont += 10;
        }
        s.tempo = tempoFinal - tempoInicio;
        
        return s;
    }
    
    public static Solucao gulosa(int[] entrada){
        
        System.out.println("Busca gulosa");
        
        BuscaGulosa bg = new BuscaGulosa();
        
        long tempoInicio = System.currentTimeMillis();
        Solucao s = bg.buscar(entrada, 100);
        s.tempo = System.currentTimeMillis()-tempoInicio;
        
        return s;
    }
    
    public static Solucao aEstrela(int[] entrada){
        
        System.out.println("Busca A*");
        
        return null;
    }
    
}
