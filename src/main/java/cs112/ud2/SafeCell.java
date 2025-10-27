package cs112.ud2;

public class SafeCell extends Cell {
    private int neighborMines;

    public SafeCell() {

    }

    public SafeCell(int neighborMines) {
        this.neighborMines = neighborMines;
    }

    public int getNeighboringMines() {
        return neighborMines;
    }

    public void setNeighboringMines(int neighboringMines) {
        this.neighborMines = neighboringMines;
    }

    @Override
    public boolean isMine() {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}

