package Buscas;

import java.util.ArrayList;

public class Estado {

    public int[] tabuleiro;
    public int nivel;
    public Estado pai;
    public ArrayList<Estado> filhos;

    public Estado(int[] tabuleiro, int nivel, Estado pai) {
        this.tabuleiro = tabuleiro;
        this.nivel = nivel;
        this.filhos = new ArrayList<>();
        this.pai = pai;
    }

    private void troca(int[] tabuleiro, int a, int b) {
        int temp = tabuleiro[a];
        tabuleiro[a] = tabuleiro[b];
        tabuleiro[b] = temp;
    }

    private void geraCantos(int posicao) {
        Estado filho;
        switch (posicao) {
            case 0:
                filho = criaFilhos(posicao, 1);
                filhos.add(filho);
                filho = criaFilhos(posicao, 3);
                filhos.add(filho);
                break;

            case 2:
                filho = criaFilhos(posicao, 1);
                filhos.add(filho);
                filho = criaFilhos(posicao, 5);
                filhos.add(filho);
                break;

            case 6:
                filho = criaFilhos(posicao, 3);
                filhos.add(filho);
                filho = criaFilhos(posicao, 7);
                filhos.add(filho);
                break;

            case 8:
                filho = criaFilhos(posicao, 5);
                filhos.add(filho);
                filho = criaFilhos(posicao, 7);
                filhos.add(filho);
                break;
        }
    }

    private void geraLados(int posicao) {
        Estado filho;
        switch (posicao) {
            case 1:
                filho = criaFilhos(posicao, 0);
                filhos.add(filho);
                filho = criaFilhos(posicao, 2);
                filhos.add(filho);
                filho = criaFilhos(posicao, 4);
                filhos.add(filho);
                break;

            case 3:
                filho = criaFilhos(posicao, 0);
                filhos.add(filho);
                filho = criaFilhos(posicao, 4);
                filhos.add(filho);
                filho = criaFilhos(posicao, 6);
                filhos.add(filho);
                break;

            case 5:
                filho = criaFilhos(posicao, 2);
                filhos.add(filho);
                filho = criaFilhos(posicao, 4);
                filhos.add(filho);
                filho = criaFilhos(posicao, 8);
                filhos.add(filho);
                break;

            case 7:
                filho = criaFilhos(posicao, 4);
                filhos.add(filho);
                filho = criaFilhos(posicao, 6);
                filhos.add(filho);
                filho = criaFilhos(posicao, 8);
                filhos.add(filho);
                break;
        }
    }

    private void geraCentro(int posicao) {
        Estado filho = criaFilhos(posicao, 1);
        filhos.add(filho);
        filho = criaFilhos(posicao, 3);
        filhos.add(filho);
        filho = criaFilhos(posicao, 5);
        filhos.add(filho);
        filho = criaFilhos(posicao, 7);
        filhos.add(filho);
    }

    private int[] copiaTabuleiro() {
        int[] tabuleiroNovo = new int[9];
        tabuleiroNovo[0] = this.tabuleiro[0];
        tabuleiroNovo[1] = this.tabuleiro[1];
        tabuleiroNovo[2] = this.tabuleiro[2];
        tabuleiroNovo[3] = this.tabuleiro[3];
        tabuleiroNovo[4] = this.tabuleiro[4];
        tabuleiroNovo[5] = this.tabuleiro[5];
        tabuleiroNovo[6] = this.tabuleiro[6];
        tabuleiroNovo[7] = this.tabuleiro[7];
        tabuleiroNovo[8] = this.tabuleiro[8];
        return tabuleiroNovo;
    }

    private Estado criaFilhos(int a, int b) {
        Estado filho = new Estado(copiaTabuleiro(), this.nivel + 1, this);
        troca(filho.tabuleiro, a, b);
        return filho;
    }

    public void expandirNo() {
        int posicao = 0;
        int cont = 0;
        for (int i : this.tabuleiro) {
            if (i == 0) {
                posicao = cont;
            }
            cont++;
        }

        boolean cantos = (posicao == 0) || (posicao == 2) || (posicao == 6) || (posicao == 8);
        boolean lados = (posicao == 1) || (posicao == 3) || (posicao == 5) || (posicao == 7);
        //boolean centro = (posicao == 4);

        if (cantos) {
            geraCantos(posicao);
        } else if (lados) {
            geraLados(posicao);
        } else {
            geraCentro(posicao);
        }
    }

    private int[][] geraTabuleiro3x3() {
        int cont = 0;
        int[][] tabuleiro3x3 = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                tabuleiro3x3[x][y] = tabuleiro[cont];
                cont++;
            }
        }
        return tabuleiro3x3;
    }

    public int calculaManhattanDistance() {
        int[][] tabuleiro3x3 = this.geraTabuleiro3x3();
        int manhattanDistanceSoma = 0;
        for (int x = 0; x < 3; x++) // passear pelas linhas
        {
            for (int y = 0; y < 3; y++) { // passear pelas colunas
                int value = tabuleiro3x3[x][y]; // array dos elementos
                if (value != 0) { // ignorar elemento 0
                    int targetX = (value - 1) / 3; // cordenada ideal da linha
                    int targetY = (value - 1) % 3; // cordenada ideal da coluna
                    int dx = x - targetX; // distancia para a cordenada ideal na linha
                    int dy = y - targetY; // distancia para a cordenada ideal na coluna
                    manhattanDistanceSoma += Math.abs(dx) + Math.abs(dy);
                }
            }
        }
        
        return manhattanDistanceSoma;
    }
}
