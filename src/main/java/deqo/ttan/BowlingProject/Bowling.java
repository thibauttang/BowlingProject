package deqo.ttan.BowlingProject;

/**
 * Created by thibauttang on 14/11/2016.
 */
public class Bowling {

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

    public boolean estChiffre(char c){
        boolean isChiffre = false;
        int chiffre = Character.getNumericValue(c);
        if(chiffre == 0 || chiffre == 1 || chiffre == 2 || chiffre == 3 || chiffre == 4 || chiffre == 5 ||
                chiffre == 6 || chiffre == 7 || chiffre == 8 || chiffre == 9){
            isChiffre = true;
        }
        return isChiffre;
    }

    public boolean estSlash(char c){
        boolean isSlash = false;
        String str = c + "";
        if(str.equals("/")){
            isSlash = true;
        }
        return isSlash;
    }

    public boolean estUnderscore(char c){
        boolean isUnderscore = false;
        String str = c + "";
        if(str.equals("_")){
            isUnderscore = true;
        }
        return isUnderscore;
    }

    public boolean estX(char c){
        boolean isX = false;
        String str = c + "";
        if(str.equals("X")){
            isX = true;
        }
        return isX;
    }


    public int scorePartieBowling(String sequence){

        int score = 0;

        for(int i=0; i < sequence.length(); i=i+2){

            char caractereCourant = sequence.charAt(i);
            char caractereSuivant = sequence.charAt(i+1);
            char caractereSuivant2 = sequence.charAt(i+2);
            char caractereSuivant3 = sequence.charAt(i+3);


            /* Si on voit un chiffre, trois possibilités :
             Soit on voit un chiffre au prochain caractère : score = addition des deux chiffres
             Soit on voit un _ au prochain caractère : score = premier chiffre
             Soit on voit un / au prochain caractère : il s'agit d'un spare
              */
            if(estChiffre(caractereCourant)){
                if(estChiffre(caractereSuivant)){
                    //Moins de 10 quilles tombées
                    int s1 = Character.getNumericValue(caractereCourant);
                    int s2 = Character.getNumericValue(caractereSuivant);
                    score = score + (s1+s2);
                }
                else if(estUnderscore(caractereSuivant)){
                    //Aucune quille tombée au deuxième lancer du jeu
                    int s = Character.getNumericValue(caractereCourant);
                    score = score + s;
                }
                else if(estSlash(caractereSuivant)){
                    //Spare

                    //Si le premier lancer du jeu suivant est un strike;
                    if(estX(caractereSuivant2)){
                        int s = 10 + 10; //10 points pour le spare, 10 points pour le strike
                        score = score + s;
                    }
                    //Si le premier lancer du jeu suivant est un chiffre;
                    if(estChiffre(caractereSuivant2)){
                        int s = 10 + Character.getNumericValue(caractereSuivant2);
                        score = score + s;
                    }
                }
            }


            //Si on voit un chiffre, on le transforme en int pour simplifier les tests :


            }
        return score;
    }
}



