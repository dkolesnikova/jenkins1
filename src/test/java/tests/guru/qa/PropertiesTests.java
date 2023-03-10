//package tests.guru.qa;
//
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//public class PropertiesTests {
//
//    @Test
//    void propertiesTest () {
//        String browserName = System.getProperty("browser");
//        System.out.println(browserName); //null
//    }
//
//    @Test
//    void properties1Test () {
//        System.setProperty("browser", "opera");
//        String browserName = System.getProperty("browser");
//        System.out.println(browserName); //opera
//    }
//
//    @Test
//    void properties2Test() {
//        String browserName = System.getProperty("browser", "firefox");
//        System.out.println(browserName); //firefox
//    }
//
//    @Test
//    void properties3Test() {
//        System.setProperty("browser", "opera");
//        String browserName = System.getProperty("browser", "firefox");
//        System.out.println(browserName); //opera
//    }
//
//    @Test
//    @Tag("one_property")
//    void properties4Test() {
//        String browserName = System.getProperty("browser", "firefox");
//        System.out.println(browserName);
//        //gradle clean one_property_test
//        //firefox
//
//        //gradle clean one_property_test -Dbrowser=safari
//        //safari
//    }
//
//    @Test
//    @Tag("Hello")
//    void properties5Test () {
//        System.out.println("Hello, " + System.getProperty("user_name", "unknown student"));
//
//        /*
//            gradle clean hello_test
//            Hello, unknown student
//
//            gradle clean hello_test -Duser_name=Alex
//            Hello, Alex
//
//            gradle clean hello_test -Duser_name=Alex Egorov
//            Hello, Alex Egorov
//            Task 'Egorov' not found in root project 'jenkins2'.
//
//            gradle clean hello_test "-Duser_name=Alex Egorov"
//            gradle clean hello_test -Duser_name="Alex Egorov"
//          */
//    }
//}
