package Tests_ex_3_Primitive_Types_Test;

import My_Work.java_1_Chruściel_Manual.ex_4_primitive_types.PrimitiveTypes;
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
