package cs112.ud2;

public class Easy extends Difficulty{
    //CONSTRUCTORS
    public Easy() {
        super();
    }

    //Full constructor
    public Easy(String name, int width, int height, int mineTiles, int flags) {
        super(name, width, height, mineTiles, flags);
    }

    //Copy constructor
    public Easy(Easy o) {
        super(o);
    }

    //No setters or getters because they are inherited.

    //ABSTRACT METHODS IMPLEMENTED

    @Override
    public void difficultyChosen(Difficulty difficulty) {
        //placeholder until we can make this change the layout
    }
}
