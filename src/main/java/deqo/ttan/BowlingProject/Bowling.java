package deqo.ttan.BowlingProject;

/**
 * Created by thibauttang on 14/11/2016.
 */
public class Bowling {

    public int[] sequenceLancers;

    public int score;   //score de la partie
    public int[] tabPartie;


    public boolean sequenceIsValid(int[] sequenceLancers){
        boolean isValid = false;
        if(sequenceLancers.length >= 10 && sequenceLancers.length <= 12){
            isValid = true;
        }
        return isValid;
    }
/* Vérifier la validité de chaque jeu
    public boolean jeuIsValid(){
        for(int i=0; i <= sequenceLancers.length; i++){
            if(sequenceLancers[i] ...)
        }
    }
*/

/* Vérifier la validité de chaque jeu
    ...
*/




}
