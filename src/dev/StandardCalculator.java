package dev;

public class StandardCalculator extends CalculateA {
    private String expressions;
    int idx;

    StandardCalculator(String s) {
        this.expressions = s;
    }

    public void Commander() {
        this.expressions = this.expressions.replaceAll(" ", "");
        makePostfixE();
        System.out.println(this.expressions);
        System.out.println("Result is : " + Calculate());
    }

    private byte prior(char op) {
        if (op == '(' || op == ')') return 0;
        else if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        else return -1;
    }

    private void makePostfixE() {
        String tmp = "";
        Stack stk = new Stack();
        boolean flag = false;

        for (int i = 0; i < this.expressions.length(); ++i) {
            char c = this.expressions.charAt(i);

            if (c == '*' || c == '/') {
                while (!stk.is_empty() && prior((char) stk.top()) >= prior(c)) {
                    tmp += stk.top() + " ";
                    stk.pop();
                }
                stk.push(c);
            } else if (c == '+') {
                if (i - 1 >= 0 && Character.isDigit(this.expressions.charAt(i - 1))) {
                    while (!stk.is_empty() && prior((char) stk.top()) >= prior(c)) {
                        tmp += stk.top() + " ";
                        stk.pop();
                    }
                    stk.push(c);
                }
            } else if (c == '-') {
                if (i == 0) {
                    tmp += "-";
                } else if (i - 1 >= 0 && Character.isDigit(this.expressions.charAt(i - 1))) {
                    while (!stk.is_empty() && prior((char) stk.top()) >= prior(c)) {
                        tmp += stk.top() + " ";
                        stk.pop();
                    }
                    stk.push(c);
                } else {
                    tmp += '-';
                }
            } else if (c == '(') {
                stk.push(c);
            } else if (c == ')') {
                while ((char) stk.top() != '(') {
                    tmp += stk.top();
                    stk.pop();
                }
                stk.pop();
            } else if (Character.isDigit(c)) {
                tmp += c;
                flag = true;
                continue;
            }
            if (flag)
                tmp += " ";
        }
        tmp += " ";
        while (!stk.is_empty()) {
            tmp += (stk.top() + " ");
            stk.pop();
        }
        this.expressions = tmp;
    }

    private double BinaryOperator(double or1, double or2, char ch) {
        if (ch == '+')
            return or1 + or2;
        else if (ch == '-')
            return or1 - or2;
        else if (ch == '*')
            return or1 * or2;
        else
            return or1 / or2;
    }

    public double Calculate() {
        Stack stk = new Stack();
        String s1 = "";

        int length = this.expressions.length();
        for (int i = 0; i < length; ++i) {
            char c = this.expressions.charAt(i);
            if (c == ' ') {
                continue;
            } else if (Character.isDigit(c)) {
                if (Character.isDigit(this.expressions.charAt(i + 1))) {
                    s1 += c;
                    continue;
                } else {
                    s1 += c;
                    stk.push(Double.parseDouble(s1));
                    s1 = "";
                }
            } else if (c == '+' || c == '*' || c == '/' || c == '-') {
                double ord1 = (double) stk.pop();
                double ord2 = (double) stk.pop();
                stk.push(BinaryOperator(ord2, ord1, c));
            }
        }
        return ((double) stk.pop());
    }
}
