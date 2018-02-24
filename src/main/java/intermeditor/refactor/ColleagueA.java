package intermeditor.refactor;


public class ColleagueA extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator coll) {
        this.number = number;
        coll.AaffectB();
    }
}
