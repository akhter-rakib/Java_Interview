package Polymorphism.CompileTimePolymorphism;

public class DemoMethodHiding {
    public static void main(String[] args) {
        Movie movie = new Movie();
        OverHidingDemo overHidingDemo = new OverHidingDemo();
        Movie methodHiding = new OverHidingDemo();
        /*As method overriding concept the OverHidingDemo class method should be called but the reference
         * type method is called here because here overriding concept is not implement because both static
         * method is implement in both classes */
        /* In method overriding jvm call method base on run time object but if it is overloading then method
  resolution will be held base on reference type object. But Here the reference */

        movie.selectionHeroHeroine();
        overHidingDemo.selectionHeroHeroine();
        methodHiding.selectionHeroHeroine();

    }
}
