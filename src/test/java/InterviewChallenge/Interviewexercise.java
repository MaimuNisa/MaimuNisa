package InterviewChallenge;

import io.cucumber.java.bs.I;
import io.cucumber.java.hu.Ha;

import java.util.*;

public class Interviewexercise {
    public static void main(String[] args) {
//count letter in map
//      String str = "hello word how are you ";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i =0;i<str.length();i++){
//            if(map.containsKey(str.charAt(i))){
//                int coumt = map.get(str.charAt(i));
//                map.put(str.charAt(i),coumt +1);
//            }else {
//                map.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(map);
//-----------------------------------------------------------------------------------
// count the word in array regex space . store it to hashmap
//    String str1 = "hello hello mama mama water water";
//    String[] split = str1.split(" ");
//
//    HashMap<String, Integer>map1= new HashMap<>();
//
//    for(int i =0; i < split.length;i++){
//       if(map1.containsKey(split[i])){
//           int count = map1.get(split[i]);
//            map1.put(split[i],count + 1);
//
//
//       }else {
//           map1.put(split[i],1);
//       }
//   }
//        System.out.println(map1);


//
//--------------------------------------------------------------------------------------
        String st = "Alice is girl and Bob is boy";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();

        // Splitting the words of string
        // and storing them in the array.
        String[] words = st.split(" ");

        for (String word : words) {

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);

            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);

            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);

//-------------------------------------------------------------------------------------------
        String str = "Hello World, Welcome to to Softhunt";
        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count + 1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);



//        String str1 = "hello hello mama mama water water";
//        String[] split1 = str1.split(" ");
//        HashMap<String, Integer>map1= new HashMap<>();
//
//    for(int i =0; i < split1.length;i++){
//
//       if(map1.containsKey(split1[i])){
//           int count = map1.get(split1[i]);
//           map1.put(split1[i], count + 1);
//
//
//       }else {
//           map1.put(split1[i], 1);
//       }
//   }
//        System.out.println(map1);


//
//        String str = "selenium";
//        String rev = "";
//        int len = str.length();
//
//        for(int i = len-1 ; i>=0;i--){
//            rev = rev + str.charAt(i);
//
//        }
//        System.out.println(rev);

//        ArrayList<String> strings = new ArrayList<>();
//       strings.add("hello world");
//        strings.add("hello world");
//       strings.add("hell word");
//        strings.add("no noo");
//        strings.add("no noo");
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.lastIndexOf(strings.get(i)) != i) {
//                System.out.print(","+strings.get(i)+ " is duplicate ");
//            }
//
//        }
//        ArrayList<String> list=new ArrayList();
//        list.add("Sagio Mane");
//        list.add("Karius");
//        list.add("Mo Salah");
//        list.add("Firmino");
//        list.add("Lovren");
//        list.add("Steven Gerrard");
//        list.add("Karius");
//        list.add("Mo Salah");
//       Set<String> s = new HashSet<String>();
//        for(String name :list) {
//            if(s.add(name)== false)
//                System.out.println(name +" is duplicated");
//            }
//        }

//-------------------------------------------------------------------------------------------------------
        // find the duplicate element in arraylist

      ArrayList < String> list = new ArrayList<>();
        list.add("hello world");
        list.add("hello world");
        list.add("no");
        list.add("no");
        list.add("how");

      for (int i =0 ;i<list.size();i++){
          if(list.lastIndexOf(list.get(i)) != i){
              System.out.println(list.get(i)+" is duplicate" );
          }

          }
        }




//

    }





