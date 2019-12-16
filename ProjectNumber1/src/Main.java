public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        String[] input = {"a", "e", "i", "o", "u"};
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                answer++;
            }
        }
        System.out.println("test " + answer);
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        String[] str = {"bob"};
        for(int j = 0; j < s.length();j++){
            if(j < s.length()-2){
                if(s.charAt(j)=='b' && s.charAt(j+1)=='o' && s.charAt(j+2)=='b'){
                    answer++;
                }
            }
        }
        System.out.println("test "+answer);
        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String temp) {
        String result = "";
        String tmp = "";
        for (int i = 0; i <temp.length(); i++) {
            tmp+=temp.charAt(i);
            if(tmp.length() > result.length()){
                result = tmp;
            }
            if(i>(temp.length()-2)){
                break;
            }
            if(temp.charAt(i) > temp.charAt(i+1)){
                tmp = "";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //problemOne("wurexc");
        String s  = "wurexc";
        System.out.println(problemOne(s));

        //problemTwo("ybovtobboboobcboobbobbbob");
        s ="ybovtobboboobcboobbobbbob";
        System.out.println(problemTwo(s));

        problemThree("");
        s = "ixysuoizvwwebyyhp";
        System.out.println(problemThree(s));
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

    }
}