package bridge.refactor;

public  abstract  class People {

    protected AbstractRoad abstractRoad;

    public void setAbstractRoad(AbstractRoad abstractRoad){
        this.abstractRoad = abstractRoad;
    }

    public  abstract void run();

}

