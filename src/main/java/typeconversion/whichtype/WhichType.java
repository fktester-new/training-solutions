package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    List<Type> whichType(String s) {
        List<Type> types = new ArrayList<>();
        for (Type type : Type.values()){
            Long n = Long.parseLong(s);
            if(n > type.getMinValue() && n < type.getMaxValue()) {
                types.add(type);
            }
        }
        return types;
    }

}
