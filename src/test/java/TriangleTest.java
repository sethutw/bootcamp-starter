import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    @Test
    @DisplayName("should return perimeter as 12")
    public void testPerimeter1() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.perimeter());
    }

    @Test
    @DisplayName("should return perimeter as 13")
    public void testPerimeter2() {
        Triangle triangle = new Triangle(3, 4, 6);
        assertEquals(13, triangle.perimeter());
    }

    @Test
    @DisplayName("3, 4, 5 should be a right angled triangle")
    public void rightAngleTess1() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isRightAngled());
    }
}
