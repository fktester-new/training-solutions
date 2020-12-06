package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(){
        this(BiscuitType.PILOTA);
    }

    public Biscuit(BiscuitType type){
        this(type, type.getGramAmount());
    }

    public Biscuit(BiscuitType type, int gramAmount) {
        if (type == null){
            throw new IllegalArgumentException("Type is missing!");
        }
        if (gramAmount <= 0){
            throw new IllegalArgumentException("There must be a valid gram amount!");
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

   public static Biscuit of(BiscuitType type, int gramAmount) {
        Biscuit biscuit = new Biscuit(type, gramAmount);
        return biscuit;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "type= " + type +
                ", gramAmount= " + gramAmount +
                '}';
    }
}