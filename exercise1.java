public class exercise1 {

    static boolean iWillbehave = true;
    static boolean iWillgrduate = true;

    public static void main(String[] args) throws Exception {
       //precondition
        assert iWillbehave == true : "panget";

        College();
        //postcondition
        assert iWillgrduate == true : "kawawa";

    }

    static void College(){
       iWillgrduate = false; 
       System.out.println("Congrats alipin kana ng kapitalismo");
       

    }
}
