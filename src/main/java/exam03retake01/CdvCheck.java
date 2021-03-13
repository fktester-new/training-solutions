package exam03retake01;

public class CdvCheck {

    public boolean check(String taxNr) {
        if (taxNr == null || taxNr.length() != 10) {
            throw new IllegalArgumentException("Invalid tax number!");
        }
        if (notNumber(taxNr)) {
            throw new IllegalArgumentException("Invalid tax number");
        }
        String[] temp = taxNr.split("");
        long sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += ((i + 1) * Long.parseLong(temp[i]));
        }
        return ((sum % 11) == Long.parseLong(temp[9]));
    }

    private boolean notNumber(String s) {
        try {
            Long.parseLong(s);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }
}
