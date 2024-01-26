package Exceptions;

import Exceptions.CustomExceptions.PilePleineException;
import Exceptions.CustomExceptions.PileVideException;

public class Pile {
    private static final int DIM = 10;
    private Object[] tab;
    private int nbElem;

    public Pile() {
        tab = new Object[DIM];
    }

    public void empiler(Object o) throws PilePleineException {
        if (nbElem == 10)
            throw new PilePleineException("Pile Pleine!");
        tab[nbElem++] = o;
    }

    public Object depiler() throws PileVideException {
        if (nbElem == 0)
            throw new PileVideException("Pile Vide!");
        return tab[--nbElem];
    }
}
