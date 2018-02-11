package flyweight;

public class Client {

    public static void main(String[] args) {

        Flyweight fw0 = FlyweightFactory.getFlyWeight("战士");
        Flyweight fw1 = FlyweightFactory.getFlyWeight("战士");
        Flyweight fw2 = FlyweightFactory.getFlyWeight("法师");
        Flyweight fw3 = FlyweightFactory.getFlyWeight("坦克");

        fw0.operation("瑞文");
        fw1.operation("鳄鱼");
        fw2.operation("光辉");
        fw3.operation("坦克");

        System.out.printf("[结果(对象对比) - [%s] \n", fw0 == fw1);
        System.out.printf("[结果(对象对比) - [%s] \n", fw0 == fw1);
        System.out.printf("一共召回 %s 中类型英雄",FlyweightFactory.total());

    }
}


