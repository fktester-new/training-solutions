package week08d01;

public enum Move {
    F{
        @Override
        public void step(Position position){
            position.setY(position.getY()+1);
        }
    },
    L{
        @Override
        public void step(Position position) {
            position.setY(position.getY() -1);
        }
    },

    J{
        @Override
        public void step(Position position){
            position.setX(position.getX() +1);
        }
    },

    B{
        @Override
        public void step(Position position) {
            position.setX(position.getX() - 1);

        }
    };
    public abstract void step();
}
