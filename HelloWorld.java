/**

Ubuntu 18.04.3 LTS

$ javac --version
javac 11.0.5
$ javac HelloWorld.java -h .
$ ls
HelloWorld.class  HelloWorld.h  HelloWorld.java
$ gcc -c -fpic HelloWorld.c -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux
$ gcc -shared -o libHelloWorld.so HelloWorld.o
$ sudo mkdir -p /usr/java/packages/lib
$ sudo cp libHelloWorld.so /usr/java/packages/lib/
$ java HelloWorld 
Hello World!
*/
public class HelloWorld {
    private native void print();

    public static void main(String[] args) {
        new HelloWorld().print();
    }

    static {
        System.loadLibrary("HelloWorld"); // it will search for libHelloWorld.so
    }
}
