import friends.Chandler;
import friends.Joey;
import friends.Monica;
import friends.Phoebe;
import scene.Scene;
import shared.SharedObject;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scene scene = new Scene();
        SharedObject sharedObject = new SharedObject();

        Thread joey = new Thread(new Joey(scene, sharedObject, new HashSet<>(Arrays.asList(0, 4, 7, 11, 13))));
        Thread chandler = new Thread(new Chandler(scene, sharedObject, new HashSet<>(Arrays.asList(1, 3, 5, 10, 12))));
        Thread phoebe = new Thread(new Phoebe(scene, sharedObject, new HashSet<>(Arrays.asList(2, 6, 9))));
        Thread monica = new Thread(new Monica(scene, sharedObject, new HashSet<>(Arrays.asList(8))));


        joey.start();
        chandler.start();
        phoebe.start();
        monica.start();
        
        joey.join();
        chandler.join();
        phoebe.join();
        monica.join();

    }
}
