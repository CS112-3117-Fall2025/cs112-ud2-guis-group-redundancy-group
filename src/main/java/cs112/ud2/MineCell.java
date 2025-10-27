package cs112.ud2;

public class MineCell extends Cell {
    public MineCell() {

    }

    @Override
    public boolean isMine() {
        return true;
    }

    @Override
    public String toString() {
        return "💣";
    }
}

