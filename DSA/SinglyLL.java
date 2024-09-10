import java.util.*;
class SinglyLL{
    public static void main(String[] args){
        LinkedList<String> l=new LinkedList<String>();
        //*Mimic-ing Stack
        l.push("Tosh");
        l.push("Ashu");
        l.push("Mishra");
        l.push("Gupta");
        l.push("Bhadwa");
        l.push("Bhikmanga");
        l.push("Daddy-mesh");
        System.out.println(l);

        for(int i=0;i<4;i++){
            l.pop();
        }
        System.out.println(l);

        l.offer("Tosh");
        System.out.println(l);

        l.poll();
        System.out.println(l);

        //* Linked List Operations
        l.add(1,"POGGERS");
        l.remove("POGGERS");
        System.out.println(l);
        //! No random access in ll

        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());

        l.addFirst("Ashu");
        l.addLast("Gupta");

        String first = l.removeFirst();
        String second = l.removeLast();

        System.out.println(l);

        //! Implement Stack/Queues
        //! GPS,Music Playlist
    }
}