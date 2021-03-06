
package Buscas;

import java.util.ArrayList;

public class BuscaProfundidade {
    
    Pilha fronteira;
    
    public BuscaProfundidade(){
        this.fronteira = new Pilha();
    }
    
    public Solucao buscar(int[] tabInicial, int maxProfundidade){
        
        int qNos = 1; //ja conta o estado inicial
        Estado eInicial = new Estado(tabInicial, 1, null);
        fronteira.push(eInicial);
        
        while(!this.fronteira.isEmpty()){
            
            System.out.println("fronteira: "+this.fronteira.size());
            
            Estado e = this.fronteira.pop();
            if(this.isSolution(e.tabuleiro)){
                System.out.println("*********************** Encontrou a solução *******************");
                this.printTabuleiro(e.tabuleiro);
                return this.construirSolucao(e, qNos, e.nivel);
            }else if(e.nivel != maxProfundidade){
                e.expandirNo();
                qNos += e.filhos.size();
                for(int i = e.filhos.size()-1; i >= 0; i--){
                    this.fronteira.push(e.filhos.get(i));
                }
            }
        }
        
        return null;
    }
    
    public Solucao construirSolucao(Estado eFinal, int qNos, int qNiveis){
        
        Pilha caminho = new Pilha();
        ArrayList<int[]> passos = new ArrayList<>();
        
        Estado atual = eFinal;
        while(atual.pai != null){
            caminho.push(atual);
            atual = atual.pai;
        }
        
        caminho.push(atual);
        
        while(! caminho.isEmpty()){
            passos.add(caminho.pop().tabuleiro);
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
