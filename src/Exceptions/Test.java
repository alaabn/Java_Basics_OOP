package Exceptions;

import Exceptions.CustomExceptions.PilePleineException;
import Exceptions.CustomExceptions.PileVideException;

public class Test {
    public static void main(String[] args) {
        Pile p = new Pile();

        try {
            for (String o : args) {
                p.empiler(o);
            }
        } catch (PilePleineException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                System.out.println(p.depiler());
            }
        } catch (PileVideException e) {
            System.out.println(e.getMessage());
        }
    }
}
