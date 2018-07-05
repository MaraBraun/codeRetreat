package main;

public class Welt {

    Zelle [][] zellen;

    public Welt(int dimensionX, int dimensionY) {
        zellen = new Zelle[dimensionX][dimensionY];
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                zellen[i][j] = new Zelle(false);
            }
        }
    }
}
