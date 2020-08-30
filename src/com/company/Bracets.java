package com.company;

import java.util.Stack;

public class Bracets {
    public static int solution(String S) {
        Stack stack = new Stack();

        if(S.length() == 0 ){
            return 1;
        }

        for(int i = 0; i <S.length(); i++){
            char c = S.charAt(i);
            if(c=='[' || c=='{' ||  c=='('){
                stack.push(c);
            }
            if(c==']' || c==')'||  c=='}'  ){
                stack.pop();
            }

        }

        if(stack.isEmpty()){
            return 1;
        }

        return 0;


    }
}

