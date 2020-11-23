package controlselection.week;

public class DayOfWeeks {
    public String getTypeOfDay(String dayOfWeekArg) {

        switch(dayOfWeekArg.toLowerCase()) {
            case "hétfő":
                return "hét eleje";
            case "kedd":
            case "szerda":
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat":
            case "vasárnap":
                return "hétvége";
            default:
                throw new IllegalArgumentException("Érvénytelen nap: " + dayOfWeekArg);
        }
    }
}
