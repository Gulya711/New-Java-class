public class Person {
    String name;
    int age;
    char gender;
    String getName(){
        if(gender =='M'){
          return "Mr. "+name;
        }else {
            return "Mrs. "+name;
        }
    }
}
