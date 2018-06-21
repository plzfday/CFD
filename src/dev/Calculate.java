package dev;

abstract public class Calculate {
    // 나중에 calculate, commander는 여러 군데에서 쓸 수 있을 것 같아서 abstract class로 따로 빼놓음.
    abstract public void Commander();

    abstract public double Calculate();
}


