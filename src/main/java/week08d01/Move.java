package week08d01;

public enum Move {
    F{
        public Position move(Position position){
            this.y = position.getY() + 1;
            return position;
        }
    }
    L{
        public Position move(Position position){
            this.y = position.getY() - 1;
        }
    }

    J{
        public Position move(Position position){
            this.x = position.getX() + 1;
            return position;
        }
    }

    B{
        public Position move(Position position){
            this.x = position.getX() - 1;
            return position;
        }
    }
}
