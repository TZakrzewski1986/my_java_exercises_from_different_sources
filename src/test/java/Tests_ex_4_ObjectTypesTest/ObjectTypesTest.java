package Tests_ex_4_ObjectTypesTest;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_5_object_types.ObjectTypes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ObjectTypesTest {

    @Test
    public void shouldReturnStringExampleValue() {
        // Given
        ObjectTypes objectTypes = new ObjectTypes();
        // When
        String stringExample = objectTypes.stringExample;
        // Then
        assertThat(stringExample).isEqualTo("text");
    }

    @Test
    public void shouldReturnStringNull() {
        // Given
        ObjectTypes objectTypes = new ObjectTypes();
        // When
        String stringNull = objectTypes.stringNull;
        // Then
        assertThat(stringNull).isNull();
    }

    @Test
    public void shouldReturnStringNewExampleValue() {
        // Given
        ObjectTypes objectTypes = new ObjectTypes();
        // When
        String stringNewExample = objectTypes.stringNewExample;
        // Then
        assertThat(stringNewExample).isEqualToIgnoringCase("text");
    }

    @Test
    public void shouldReturnIntegerValue() {
        // Given
        ObjectTypes objectTypes = new ObjectTypes();
        // When
        Integer integerExample = objectTypes.integerExample;
        // Then
        assertThat(integerExample).isEqualTo(1);
    }


}
