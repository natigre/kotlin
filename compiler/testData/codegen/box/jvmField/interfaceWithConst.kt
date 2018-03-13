// !LANGUAGE: +JvmFieldInInterface
// TARGER_BACKEND: JVM

// WITH_RUNTIME
// FILE: Test.java

public class Test {
    public static String publicField() {
        return Foo.o + Foo.k;
    }
}

// FILE: simple.kt

interface Foo {

    companion object {
        @JvmField
        val o = "O"

        const val k = "K"
    }
}


fun box(): String {
    return Test.publicField()
}
