package task;

import util.SimpleLinkedListStack;

import java.util.Stack;

public class Program {
    public static SimpleLinkedListStack<String> execute1(String[] line){
        SimpleLinkedListStack<String> answerLinkedListStack = new SimpleLinkedListStack<>();
        String strValue;
        for (String s : line) {
            try {
                strValue = s;
                answerLinkedListStack.push(strValue);
            } catch (NumberFormatException e) {

            }
        }
        return answerLinkedListStack;
    }

    public static Stack<String> execute2(String[] line){
        final Stack<String> answerStack = new Stack<>();
        String  strValue;
        for (String s : line) {
            try {
                strValue = s;
                answerStack.push(strValue);
            } catch (NumberFormatException e) {
            }
        }
        return answerStack;
    }
}
