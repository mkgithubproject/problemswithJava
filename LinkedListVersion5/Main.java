import java.util.*;
public class Main
{
    public static void main(String[] args) {
        UserLinkedList<User> mylist=new UserLinkedList<User>();
        User user1 = new User("1000","rockey",40);
        User user2 = new User("2000","Raul",55);
        User user3 = new User("3000","Kingster",25);
        User user4 = new User("4000","Rana",35);
        mylist.addFirst(user1);
        mylist.addFirst(user2);
        mylist.addFirst(user3);
        mylist.addFirst(user4);
       mylist.printList();
        User user5 = new User("5000","Deol",50);
        mylist.addAt(user5,3);
        System.out.println();
        mylist.printList();
        mylist.remove(3);
        System.out.println();
        mylist.printList();
    }
}

