package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final int pixels = 40;
    private final String[] letras = {"A","B","C","D","E","F","G","H","I","J"};
    public void desenhar(Draw a){
        for(int i = 0; i < 10;i++){
            a.text(20,47 * i, letras[i]);
            for(int j = 0; j < 10;j++){
                a.square(i * pixels, j * pixels, pixels);
            }
        }
   }


}
