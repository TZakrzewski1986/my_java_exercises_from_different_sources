package Tests_ex_3_Primitive_Types_Test;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_4_primitive_types.PrimitiveTypes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimitiveTypesTest {

    @Test
    public void shouldReturnDefaultByteValue() {
        // Given
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        // When
        byte byteDefault = primitiveTypes.byteDefault;
        // Then
        assertThat(byteDefault).isEqualTo((byte)0);
    }
}
