package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String string ){
        return string == null || "".equals(string.trim());
    }

    public static boolean isEmpty(List list){
        return list == null || list.size() == 0;
    }
}
