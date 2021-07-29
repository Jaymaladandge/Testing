package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.beans.Auther;
import com.beans.Operators;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Auther auther = (Auther) context.getBean("auther");
		System.out.println(auther);
		System.out.println("Details : " + auther.getDetails());
		Operators operators = (Operators) context.getBean("operators");
		System.out.println(operators.getAdd() + " " + operators.getConcate());
		System.out.println(operators.isEqual() + " " + operators.isGreater());

		System.out.println("Topic : " + auther.getTopic());
		System.out.println("match result : " + operators.getNumMatch());

		System.out.println("----------------------------------");

		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("16 * 5");
		Integer intVal = expression.getValue(Integer.class);
		System.out.println("3. Mathematical operator value:\n" + intVal);

		context.close();
	}
}

// SpelExpressionParser , which is an implementation of the ExpressionParser
// interface to parse the SpEL expressions. Calling the parseExpression method
// of the SpelExpressionParser will return an instance of SpelExpression, which
// is an implementation of the Expression interface. The evaluated result can be
// found by calling the getValue method.
// If you want more control over Life Cycle like Initialisation and Destruction,
// you can use ConfigurableApplicationContext.