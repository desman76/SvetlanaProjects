package lesson62;

class Class2 extends Class1 {
    @FilterIt(show = true)
    String field21;
    @FilterIt (show = true)
    Object field22;
    @FilterIt(show = false)
    int field23;

    @FilterIt(show = true)
    String method21() {
        return "";
    }
    @FilterIt (show = true)
    Integer method22(){
        return 0;
    }
    @FilterIt (show = false)
    Double method23(){
        return 0.0;

    }
}