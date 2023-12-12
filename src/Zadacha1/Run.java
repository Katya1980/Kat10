package Zadacha1;

public class Run {

    public static void main (String[]args)throws CloneNotSupportedException{

        User user = new User("Den",1);
        User user1 = new User("Den",1);
        User user2 = new User("Sam",3);

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user. equals(user1));
        System.out.println(user1. equals(user2));

User clone;
try {
    clone = user.clone("поверх");
    clone.setId(4);
    System.out.println(user.getName() +" " + clone.getId());


}catch (CloneNotSupportedException  e){
    System.out.println();
}




    }
}
