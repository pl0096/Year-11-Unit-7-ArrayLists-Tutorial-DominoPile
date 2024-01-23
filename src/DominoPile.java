import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        int top = 0;
        int bottom = 0;
        for(int i = 0; i <= 6; i++){

            for(int ii = top; ii <= 6; ii++){
                Domino domino = new Domino();

                domino.setTop(top);
                domino.setBottom(bottom);
                domino.settle();
                if(!pile.contains(domino)){
                    pile.add(domino);
                }
                bottom++;
            }
            top++;
            bottom = top;
        }
    }

    public void shuffle(){
        ArrayList<Domino> newPile = new ArrayList<Domino>();
        int ii;
        for (int i = pile.size() -1; i > 0; i--){
            Random rand = new Random();
            ii = rand.nextInt(0, i);
            newPile.add(pile.get(ii));
            pile.remove(ii);

        }
        pile = newPile;


    }


}
