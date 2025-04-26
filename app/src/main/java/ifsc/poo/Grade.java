package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    private final int pixels = 45;
    private final String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public void desenhar_pintado(Draw a,int offsetX,int offsetY){
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            // Letras na esquerda
            a.setPenColor(Color.RED);//pinta a letra
            a.text(offsetX - 20, offsetY + i * pixels + pixels/2, letras[i]);
            a.setPenColor(Color.BLACK);// pinta de preto pra não ficar tudo vermelho kkkk
            for (int j = 0; j < 10; j++) {
                a.square(offsetX + j * pixels + pixels/2, offsetY + i * pixels + pixels/2, pixels/2.0);
                if(cont == 0){
                    a.setPenColor(Color.RED);
                    a.text(offsetX + j * pixels + pixels/2, offsetY - 1 * pixels + pixels/2, String.valueOf(j));
                    a.setPenColor(Color.BLACK);
                    if(j == 9){
                        cont = 1;
                    }
                }
                //pinta os quadrados
                a.setPenColor(Color.RED);
                a.filledSquare(257,162,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(257,207,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(257,252,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(257,297,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(257,342,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(257,72,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(212,72,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(167,72,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(122,72,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(347,162,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(347,207,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(347,117,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(212,432,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(167,432,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(437,387,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(437,342,22);
                a.setPenColor(Color.BLACK);

                a.setPenColor(Color.RED);
                a.filledSquare(437,297,22);
                a.setPenColor(Color.BLACK);
            }
        }
    }

    public void desenhar_despintado(Draw a,int offsetX,int offsetY){
        int cont = 0;
        for(int p = 0; p < 10; p++){
            // Letras na esquerda
            a.setPenColor(Color.RED);
            a.text(offsetX - 20, offsetY + p * pixels + pixels/2, letras[p]);
            a.setPenColor(Color.BLACK);
            for(int o = 0; o < 10; o++){
                a.square(offsetX + o * pixels + pixels/2, offsetY + p * pixels + pixels/2, pixels/2.0);
                if(cont == 0){
                    a.setPenColor(Color.RED);
                    a.text(offsetX + o * pixels + pixels/2, offsetY - 1 * pixels + pixels/2, String.valueOf(o));
                    a.setPenColor(Color.BLACK);
                    if(o == 9){
                        cont = 1;
                    }
                }
            }
        }
    }
}
