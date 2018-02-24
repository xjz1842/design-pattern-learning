package five.principle.dependencyInvert;

/**
 * http://mp.weixin.qq.com/s?__biz=MzI4Njc5NjM1NQ==&mid=2247484531&idx=2&sn=f352aad0412465aab38575f4fc3c7ed1&scene=21#wechat_redirect
 *
 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。

 问题由来：类A直接依赖类B，假如要将类A改为依赖类C，则必须通过修改类A的代码来达成。这种场景下，类A一般是高层模块，负责复杂的业务逻辑；类B和类C是低层模块，负责基本的原子操作；假如修改类A，会给程序带来不必要的风险。

 解决方案：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低修改类A的几率。

 依赖倒置原则的核心思想是面向接口编程
 */
