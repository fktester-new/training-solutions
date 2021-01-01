package statemachine.typewriter;

public enum TypeWriterState {

    LOWERCASE{
        TypeWriterState next(){
            return UPPERCASE;
        }
    },
    UPPERCASE{
        TypeWriterState next(){
            return LOWERCASE;
        }
    };
    abstract TypeWriterState next();
}
