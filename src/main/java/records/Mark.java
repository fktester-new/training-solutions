package records;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (markType == null){
            throw new NullPointerException("Mark type must not be null!");
        }
        this.markType = markType;
        if (subject == null || tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        switch (markType) {
            case "A":
                this.markType = MarkType.A;
                break;
            case "B":
                this.markType = MarkType.B;
                break;
            case "C":
                this.markType = MarkType.C;
                break;
            case "D":
                this.markType = MarkType.D;
                break;
            case "F":
                this.markType = MarkType.F;
                break;
            default:
                System.out.println("Invalid mark");
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public String toString(){
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }
}

