import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/station.csv")



    public void testStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.next();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    public void testVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.next();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


}
