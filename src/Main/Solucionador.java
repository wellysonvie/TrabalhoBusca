
package Main;

import java.util.ArrayList;

public class Solucionador {

    @SuppressWarnings("empty-statement")
    public static ArrayList<int[]> largura(int[] entrada){
        
        System.out.println("Busca em largura");
        
        
        return null;
    }
    
    public static ArrayList<int[]> profundidade(int[] entrada){
        
        System.out.println("Busca em profundidade");
        
        ArrayList<int[]> solucao = new ArrayList<>();
        int[] a = {2, 3, 1, 4, 5, 6, 8, 7, 0};
        solucao.add(a);
        int[] b = {3, 0, 1, 4, 2, 5, 8, 6, 7};
        solucao.add(b);
        int[] c = {8, 1, 3, 0, 6, 5, 4, 2, 7};
        solucao.add(c);
        int[] d = {5, 6, 2, 8, 0, 1, 4, 3, 7};
        solucao.add(d);
        
        for(int i : entrada){
            System.out.print(" "+i);
        }
        
        return solucao;
    }
    
    public static ArrayList<int[]> gulosa(int[] entrada){
        
        System.out.println("Busca gulosa");
        
        return null;
    }
    
    public static ArrayList<int[]> aEstrela(int[] entrada){
        
        System.out.println("Busca A*");
        
        return null;
    }
    
}
