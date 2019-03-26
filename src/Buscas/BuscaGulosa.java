
package Buscas;

import java.util.ArrayList;

public class BuscaGulosa {
    
    Fila caminho;
    
    public BuscaGulosa(){
        this.caminho = new Fila();
    }
    
    public Solucao buscar(int[] tabInicial, int maxProfundidade){
        
        int qNos = 1; //já conta o nó inicial
        Estado eInicial = new Estado(tabInicial, 1, null), atual;
        
        atual = eInicial;
        this.caminho.add(atual);
        System.out.println("fronteira: 1");
        
        while(! this.isSolution(atual.tabuleiro)){
            
            if(atual.nivel == maxProfundidade){
                return null;
            }else{
                atual.expandirNo();
                System.out.println("fronteira: "+atual.filhos.size());
                qNos += atual.filhos.size();
                int menorDistancia = 0;
                for(int i = 0; i < atual.filhos.size(); i++){
                    if(i == 0)
                        menorDistancia = atual.filhos.get(i).calculaManhattanDistance();
                    else if(menorDistancia > atual.filhos.get(i).calculaManhattanDistance()){
                        atual = atual.filhos.get(i);
                        break;
                    }
                }
            }
            
            this.caminho.add(atual);
        }
        
        System.out.println("*********************** Encontrou a solução *******************");
        this.printTabuleiro(atual.tabuleiro);
        return this.construirSolucao(atual, qNos, atual.nivel);
    }
    
    public Solucao construirSolucao(Estado eFinal, int qNos, int qNiveis){
        
        ArrayList<int[]> passos = new ArrayList<>();
        
        while(! this.caminho.isEmpty()){
            passos.add(this.caminho.getAndRemove().tabuleiro);
        }
        
        return new Solucao(passos, qNiveis, qNos);
    }
    
    public boolean isSolution(int[] estado){
        int[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        for(int i = 0; i < 9; i++){
            if(solution[i] != estado[i])
                return false;
        }
        return true;
    }
    
    private void printTabuleiro(int[] tab){
        System.out.println(tab[0]+"  "+tab[1]+"  "+tab[2]);
        System.out.println(tab[3]+"  "+tab[4]+"  "+tab[5]);
        System.out.println(tab[6]+"  "+tab[7]+"  "+tab[8]);
    }
    
}
