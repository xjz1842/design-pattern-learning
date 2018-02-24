package intermeditor.refactor;

public class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator coll) {
        this.number = number;
        coll.BaffectA();
    }
}
