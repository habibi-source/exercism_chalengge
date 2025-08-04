class SqueakyClean {
    static String clean(String identifier) {
         identifier=identifier.replace(" ","_");
        StringBuilder result = new StringBuilder();
        boolean upperNext= false;
       
        for(char ch:identifier.toCharArray()){
            
            if(ch=='-'){
                upperNext=true;
                continue;
            }
            if(!(Character.isLetter(ch) || ch == '_' || Character.isDigit(ch))){
                continue;
            }

            switch(ch){
                case '4' : ch='a'; break;
                case '3' : ch='e'; break;
                case '0' : ch='o'; break;
                case '1' : ch='l'; break;
                case '7' : ch='t'; break;
                    
            }
                if(upperNext){
                    result.append(Character.toUpperCase(ch));
                    upperNext=false;
                }else{
                    result.append(ch);
                }
            }
        return result.toString();
                }
}
