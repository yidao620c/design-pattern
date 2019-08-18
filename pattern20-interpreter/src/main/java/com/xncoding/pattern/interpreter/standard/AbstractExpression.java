package com.xncoding.pattern.interpreter.standard;

/**
 * 抽象表达式
 */
public abstract class AbstractExpression {
/**
 * 解释的操作
 * @param ctx 上下文对象
 */
public abstract void interpret(Context ctx);
}
