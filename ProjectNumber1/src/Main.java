public class Main {

    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.substring(i,i+1).equals("i")){
                answer++;
            }else if (s.substring(i,i+1).equals("a")){
                answer++;
            }else if(s.substring(i,i+1).equals("e")){
                answer++;
            }else if(s.substring(i,i+1).equals("o")){
                answer ++;
            }else if(s.substring(i,i+1).equals("u")){
                answer ++;
            }

        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        return s;
    }
    public static void main(String[] args) {
        //System.out.println("Number of times bob occurs is: " + problemOne( answer));

        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
