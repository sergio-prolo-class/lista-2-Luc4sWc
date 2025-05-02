package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    private final int pixels = 45;
    private final String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public void desenhar_pintado(Draw a,int offsetX,int offsetY){

        //pinta os quadrados
        pintarCelula(a,2,3,offsetX,offsetY);
        pintarCelula(a,3,3,offsetX,offsetY);
        pintarCelula(a,4,3,offsetX,offsetY);
        pintarCelula(a,5,3,offsetX,offsetY);

        pintarCelula(a,0,0,offsetX,offsetY);
        pintarCelula(a,0,1,offsetX,offsetY);
        pintarCelula(a,0,2,offsetX,offsetY);
        pintarCelula(a,0,3,offsetX,offsetY);

        pintarCelula(a,1,5,offsetX,offsetY);
        pintarCelula(a,2,5,offsetX,offsetY);
        pintarCelula(a,3,5,offsetX,offsetY);

        pintarCelula(a,5,7,offsetX,offsetY);
        pintarCelula(a,6,7,offsetX,offsetY);
        pintarCelula(a,7,7,offsetX,offsetY);

        pintarCelula(a,8,1,offsetX,offsetY);
        pintarCelula(a,8,2,offsetX,offsetY);

        int cont = 0;
        for (int i = 0; i < 10; i++) {
            // Letras na esquerda
            a.setPenColor(Draw.BOOK_RED);//pinta a letra
            a.text(offsetX - 20, offsetY + i * pixels + pixels/2, letras[i]);
            a.setPenColor(Draw.BLACK);// pinta de preto pra não ficar tudo vermelho kkkk
            for (int j = 0; j < 10; j++) {
                a.square(offsetX + j * pixels + pixels/2, offsetY + i * pixels + pixels/2, pixels/2.0);
                if(cont == 0){
                    a.setPenColor(Draw.BOOK_RED);
                    a.text(offsetX + j * pixels + pixels/2, offsetY - 1 * pixels + pixels/2, String.valueOf(j));
                    a.setPenColor(Draw.BLACK);
                    if(j == 9){
                        cont = 1;
                    }
                }
            }
        }
    }

    public void desenhar_despintado(Draw a,int offsetX,int offsetY){
        int cont = 0;
        for(int p = 0; p < 10; p++){
            // Letras na esquerda
            a.setPenColor(Draw.BOOK_RED);
            a.text(offsetX - 20, offsetY + p * pixels + pixels/2, letras[p]);
            a.setPenColor(Draw.BLACK);
            for(int o = 0; o < 10; o++){
                a.square(offsetX + o * pixels + pixels/2, offsetY + p * pixels + pixels/2, pixels/2.0);
                if(cont == 0){
                    a.setPenColor(Draw.BOOK_RED);
                    a.text(offsetX + o * pixels + pixels/2, offsetY - 1 * pixels + pixels/2, String.valueOf(o));
                    a.setPenColor(Draw.BLACK);
                    if(o == 9){
                        cont = 1;
                    }
                }
            }
        }
    }

    //Tive que criar pq essa cor usando draw mudou tudo
    private void pintarCelula(Draw a, int linha, int coluna, int offsetX, int offsetY) {
        int x = offsetX + coluna * pixels + pixels/2;
        int y = offsetY + linha * pixels + pixels/2;
        a.setPenColor(Draw.BOOK_RED);
        a.filledSquare(x, y, pixels/2.0);
        a.setPenColor(Draw.BLACK);
    }

}
