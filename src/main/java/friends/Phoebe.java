package friends;

import scene.Scene;
import shared.SharedObject;

import java.util.Set;

public class Phoebe implements Runnable{
    private Scene scene;
    private Set<Integer> set;
    private SharedObject sharedObject;


    public Phoebe(Scene scene, SharedObject sharedObject, Set<Integer> set) {
        this.scene = scene;
        this.set = set;
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        while (!set.isEmpty()) {
            synchronized (sharedObject) {
                while (!set.contains(sharedObject.getCurrent())) {
                    try {
                        sharedObject.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Phebe: " + scene.getReplica(sharedObject.getCurrent()));
                set.remove(sharedObject.getCurrent());
                sharedObject.inc();
                sharedObject.notifyAll();

            }
        }
    }
}
