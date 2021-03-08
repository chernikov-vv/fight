public class Wizard extends Gnome implements Conjuring {

    @Override
    protected String run() {
        return ("Маг " + name + " исчез и больше его никто не видел");
    }

    @Override
    protected String death() {
        return ("Маг " + name + " умирает");
    }

    @Override
    public String fireBall() {
        return ("Маг " + name + " запускает огненный шар");
    }

    @Override
    public String iceBall() {
        return ("Маг " + name + " запускает ледяной шар");
    }

    @Override
    public String invisible() {
        return ("Маг " + name + " исчез и увернулся");
    }



    @Override
    public String iceArrow() {
        return ("Маг " + name + " запустил ледяную стрелу");
    }

    @Override
    public String flash() {
        return ("Маг " + name + " ударил молнией");
    }

    @Override
    public String iceShield() {
        return ("Маг " + name + " отразил атаку ледяным щитом");
    }

    @Override
    public String fireShield() {
        return ("Маг " + name + " отразил атаку огненным щитом");
    }
}
