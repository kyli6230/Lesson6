package guessGame;

public class GuessMachine {
    private int number;
    private int numguess;
    private int myguess;
    
    public GuessMachine(){
        numguess = 0;
        number = (int) (Math.random() * 100 + 1);
        myguess=0;
    }
    
    public String giveHint(){
        if (myguess==number)return "You got it";
        else if (myguess > number) return "Too high";
        else return "Too low";
    }
    
    public boolean setGuess (int num){
        if (num > 100 || num < 0) return false;
        myguess = num;
        numguess++;
        return true;
    }
    
    public int getnumGuesses(){
        return numguess;
    }
    
}
