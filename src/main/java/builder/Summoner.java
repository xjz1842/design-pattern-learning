package builder;

public class Summoner {

    private String name;
    private  String type;
    private String innate;

    public Summoner(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.innate = builder.innate;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", innate='" + innate + '\'' +
                '}';
    }

    private static class Builder{
        private String name;
        private String type;
        private String innate;

        protected Builder name(String name){
            this.name = name;
            return this;
        }

        protected Builder type(String tyoe){
            this.type = tyoe;
            return this;
        }

        protected Builder innate(String innate){
            this.innate = innate;
            return this;
        }

        protected Summoner build(){
            return new Summoner(this);
        }
    }

    public static void main(String[] args) {

        Summoner monkey = new Builder().name("孙悟空").type("上单").innate("基石天赋 - 战争雷霆").build();
        System.out.println(monkey.toString());

        Summoner mouse = new Builder().name("瘟疫之源").type("下路").innate("基石天赋 - 战阵热诚").build();
        System.out.println(mouse.toString());

        Summoner diann = new Builder().name("皎月女神").type("中单").build();
        System.out.println(diann.toString());
    }
}
