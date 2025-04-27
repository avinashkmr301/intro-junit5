package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll--I am only called once...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Steven"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("In After each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll--I am only called once...");
    }
}