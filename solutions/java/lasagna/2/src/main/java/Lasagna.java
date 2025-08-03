public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
 public static int expectedMinutesInOven(){
     return 40;
 }
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int now){
    return expectedMinutesInOven() - now ;
}
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int layer){
    return layer * 2;
}
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int jmlLayer, int now){
        int layers=  preparationTimeInMinutes(jmlLayer);
        return layers + now;
        
    }
}
