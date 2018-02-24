package intermeditor;

public class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number/100);
    }
}
