package week06d05;

public enum BiscuitType {
    PILOTA(40), OREO(30), KORPOVIT(15);

    private final int gramAmount;

    BiscuitType(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public int getGramAmount() {
        return gramAmount;
    }
}

