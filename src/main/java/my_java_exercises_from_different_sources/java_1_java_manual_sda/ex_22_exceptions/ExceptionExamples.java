package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_22_exceptions;

public class ExceptionExamples {

    void throwCheckedExample() throws CheckedException {
        throw new CheckedException();
    }

    void throwUcheckedExeption() {
        throw new UncheckedException();
    }

    void catchExample() {
        try {
            throwCheckedExample();
        } catch (CheckedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
