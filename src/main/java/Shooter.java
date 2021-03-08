public class Shooter extends Gnome implements Shooting {

    @Override
    protected String run() {
        return ("Лучник " + name + " бросил лук и убежал");
    }

    @Override
    protected String death() {
        return ("Лучник " + name + " умирает");
    }

    @Override
    public String hailOfArrows() {
        return ("Лучник " + name + " стреляет градом стрел");
    }

    @Override
    public String shootArrow() {
        return ("Лучник " + name + " стреляет из лука");
    }

    @Override
    public String throwsABow() {
        return ("Лучник " + name + " бросает в соперника лук");
    }

    @Override
    public String jump() {
        return ("Лучник " + name + " подпрыгнул и увернулся");
    }

    @Override
    public String bendDown() {
        return ("Лучник " + name + " присел и увернулся");
    }


}
