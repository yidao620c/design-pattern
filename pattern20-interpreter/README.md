## 解释器模式

**模式定义**

给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

这里的文法，简单点说就是我们俗称的“语法规则”。

## 优点
1. 易于实现语法

    在解释器模式中，一条语法规则用一个解释器对象来解释执行。对于解释器的实现来讲，功能就变得比较简单，
只需要考虑这一条语法规则的实现就可以了，其他的都不用管。

1. 易于扩展新的语法

    正是由于采用一个解释器对象负责一条语法规则的方式，使得扩展新的语法非常容易。扩展了新的语法，
只需要创建相应的解释器对象，在创建抽象语法树的时候使用这个新的解释器对象就可以了

## 缺点
解释器模式的缺点是不适合复杂的语法。

## 本质
解释器模式的本质：分离实现，解释执行。

## 使用场景
建议在以下情况中选用解释器模式。

当有一个语言需要解释执行，并且可以将该语言中的句子表示为一个抽象语法树的时候，可以考虑使用解释器模式。