package week03d02;

public enum Position {

    CEO(160_000), CFO(200_000), MANAGER(120_000);
    private int bonus;

    Position(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
