package Assignments;

public class Palindrome {
    public static void main(String[] args) {
        String Name = "NITIN";
        Boolean flag = true ;
        for(int i=0; i<Name.length()/2;i++){
            if(Name.charAt(i)!=Name.charAt(Name.length()-i-1)){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is Not palindrome");
        }
    }
}
