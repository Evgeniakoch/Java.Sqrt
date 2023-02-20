import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/sqr.csv")
    public void shouldCalcExact(int expected, int low, int higt) {
        SqrtService service = new SqrtService();

        int actual = service.calcAmountSqrInRange(low, higt);

        Assertions.assertEquals(expected, actual);

    }
}
