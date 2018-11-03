//  Create a function that takes a string and a list of string as a parameter
//  Returns the index of the string in the list where the first string is part of
//  Only need to find the first occurence and return the index of that
//  Returns `-1` if the string is not part any of the strings in the list

//  Example
//        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
//                System.out.println(subStrList("ching", searchArr));
                //  should print: `4`
//                System.out.println(subStrList("not", searchArr));
//  should print: `-1`


public class SubStrList {
    public static void main(String[] args) {
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        System.out.println(subStrList("not", searchArr));
        System.out.println(subStrList("this", searchArr));
        System.out.println(subStrList("is", searchArr));
    }

    public static int subStrList(String word, String[] searchArr){
        int index = -1;
        for (int i = 0; i < searchArr.length; i++) {
            if (searchArr[i].contains(word)){
                index = i;
                break;
            }
        }
        return index;
    }
}

