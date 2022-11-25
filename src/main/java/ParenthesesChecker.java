import java.util.Stack;

public class ParenthesesChecker {

//     function to check if brackets are balanced
    public static boolean checkParentheses(String str) {

//     declare a stack
     Stack<Character> myStack = new Stack<>();


//     Traversing the expression
     for(int i = 0; i < str.length(); i++) {
         char x = str.charAt(i);

         if (x == '(' || x == '[' || x == '{')
//             push the opening bracket in stack
             myStack.push(x);

         else if (x == ')' || x == ']' || x == '}') {
             if (myStack.empty()) {
                 return false;
             }

             switch (x) {
                 // opening paren bracket
                 case ')' :
                     if (myStack.pop() != '(')
                         return false;
                     break;

                 // opening square bracket
                 case ']' :
                     if (myStack.pop() != '[')
                         return false;
                     break;

                 // opening curly bracket
                 case '}' :
                     if (myStack.pop() != '{')
                         return false;
                     break;
                 default:
                     break;
             }

         }
     }

     if(!myStack.empty()) {
         return false;
     }

     return true;

    }


}












// write a method called checkParentheses()
// takes in a String
// returns a boolean

// return true if the string contains "correct" pair of parentheses
// return false if not

// situations to return false:
// more opening or closing brackets of particular type (), <>, {}, []
// closing bracket at start, opening at the end
// opening bracket followed by two closing brackets

// Use a stack