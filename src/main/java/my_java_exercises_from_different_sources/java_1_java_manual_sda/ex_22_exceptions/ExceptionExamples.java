package My_Work.java_1_Chruściel_Manual.ex_22_exceptions;

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
