package exceptionmulticatch.converter;



public class AnswerStat {


    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String str){
        try{
        return converter.binaryStringToBooleanArray(str);
    }
        catch(NullPointerException | IllegalArgumentException ex){
            throw new InvalidBinaryStringException(ex);
        }

    }

    public int answerTruePercent(String answers){
        boolean[] booleans = convert(answers);
        int sumOfTrue = 0;
        int numberOfAnswers = booleans.length;
        for (boolean b : booleans) {
            if (b){
                sumOfTrue++;
            }
        }
        return (int) Math.round((double) sumOfTrue / numberOfAnswers * 100);
    }
}
