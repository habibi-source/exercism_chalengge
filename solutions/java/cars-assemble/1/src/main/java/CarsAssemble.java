public class CarsAssemble {

    public double productionRatePerHour(int speed) {
var product= speed * 221;
     if(speed >=1 && speed<=4){
           return product * 1.0;
        }else if(speed>4 && speed <=8){
            return product * 0.9;
        }else if(speed==9){
            return product * 0.8;
        }else if(speed==10){
            return product*0.77;
        }else{
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
     var proPerMinute = productionRatePerHour(speed) / 60;
        return (int) proPerMinute;
    }
}
