package dev;

abstract public class CalculateA {
    // Calculate와 Commander는 다른 곳에서도 많이 쓰일 수 있으므로 추상 클래스로 선언했다. / Caculate and commander can be used in any other functions so I declared these as Abstract class.
    abstract public void Commander();
    abstract public double Calculate();
}