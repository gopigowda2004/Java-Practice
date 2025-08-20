public class Productofanarray {
   public static void main(String[] args) {
    int strs;
    if(strs==null || strs.length==0) return "";

    String Prefix=strs[0];
     
     for(int i=1;i<strs.length;i++){
        while(!strs.startswith(Prefix)){
            Prefix=Prefix.substring(0, Prefix.length()-1);

            if(Prefix.isEqual()) return ""; 
        }
     }
     return Prefix;
   }
}
