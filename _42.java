public class _42{ 
    public static final int answer  = 42;
    
    private int theAnswer = 0;

    private int getTheAnswer(){
        return theAnswer;
    }

    private void setTheAnswer(int answer){
        this.theAnswer = answer;
    }
    
    public int getTheAnswerToLifeTheUniverseAndEverythingElse(String...params){
        return getTheAnswer();
    }
    public static void main(String[] args) {  
        _42 __42 = new _42();
        __42.setTheAnswer(answer);
        try{
            System.out.println(
                __42.getTheAnswerToLifeTheUniverseAndEverythingElse(
                    "Life", "Universe", "Everything Else"));
        }catch (Exception e){
            System.out.println(answer);
        }

    }
}
