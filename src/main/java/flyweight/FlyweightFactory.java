package flyweight;

import java.io.Flushable;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<String,Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public static Flyweight getFlyWeight(String type){

        if(FLYWEIGHT_MAP.containsKey(type)){
            return FLYWEIGHT_MAP.get(type);
        }else{
            ConcreteFlyweight flyweight = new ConcreteFlyweight(type);
            FLYWEIGHT_MAP.put(type,flyweight);
            return flyweight;
        }
    }

    public static int total(){
        return FLYWEIGHT_MAP.size();
    }

}
