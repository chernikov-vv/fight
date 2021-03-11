public class Wizard extends Gnome implements Conjuring {

    @Override
    protected String run() {
        return ("Маг " + name + " исчез и больше его никто не видел");
    }

    @Override
    protected String death() {
        return (specialization + " " + name + " умирает");
    }

    @Override
    public String fireBall() {
        return (specialization + " " + name + " запускает огненный шар");
    }

    @Override
    public String iceBall() {
        return (specialization + " " + name + " запускает ледяной шар");
    }

    @Override
    public String invisible() {
        return (specialization + " " + name + " исчез и увернулся");
    }


    @Override
    public String iceArrow() {
        return (specialization + " " + name + " запустил ледяную стрелу");
    }

    @Override
    public String flash() {
        return (specialization + " " + name + " ударил молнией");
    }

    @Override
    public String iceShield() {
        return (specialization + " " + name + " отразил атаку ледяным щитом");
    }

    @Override
    public String fireShield() {
        return (specialization + " " + name + " отразил атаку огненным щитом");
    }
}
