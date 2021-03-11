public class Shooter extends Gnome implements Shooting {

    @Override
    protected String run() {
        return (specialization + " " + name + " бросил лук и убежал");
    }

    @Override
    protected String death() {
        return (specialization + " " + name + " умирает");
    }

    @Override
    public String hailOfArrows() {
        return (specialization + " " + name + " стреляет градом стрел");
    }

    @Override
    public String shootArrow() {
        return (specialization + " " + name + " стреляет из лука");
    }

    @Override
    public String throwsABow() {
        return (specialization + " " + name + " бросает в соперника лук");
    }

    @Override
    public String jump() {
        return (specialization + " " + name + " подпрыгнул и увернулся");
    }

    @Override
    public String bendDown() {
        return (specialization + " " + name + " присел и увернулся");
    }


}
