package lesson62;

class Class1 {
    @FilterIt(show = true)
    String field1;
    @FilterIt (show = false)
    String field2;
    @FilterIt(show = true)
    String field3;

    @FilterIt(show = true)
    void method1() {

    }
    @FilterIt (show = true)
    void method2(){
    }
    @FilterIt (show = false)
    void method3(){

    }
}
