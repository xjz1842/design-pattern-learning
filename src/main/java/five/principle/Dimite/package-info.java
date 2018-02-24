package five.principle.Dimite;



/**
 http://mp.weixin.qq.com/s?__biz=MzI4Njc5NjM1NQ==&mid=2247484610&idx=2&sn=69c875a399b7f9f4217df24e756f3fbd&scene=21#wechat_redirect
 定义：一个对象应该对其他对象保持最少的了解。
 问题由来：类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个类的影响也越大。

 解决方案：尽量降低类与类之间的耦合。

 迪米特法则还有一个更简单的定义：只与直接的朋友通信

 首先来解释一下什么是直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖、关联、组合、聚合等。其中，我们称出现成员变量、方法参数、方法返回值中的类为直接的朋友，
 而出现在局部变量中的类则不是直接的朋友。也就是说，陌生的类最好不要作为局部变量的形式出现在类的内部。
 **/