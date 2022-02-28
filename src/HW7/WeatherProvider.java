package HW7;

import HW7.enums.Periods;

import javax.imageio.IIOException;
import java.io.IOException;
import java.time.Period;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

    void getWeatherIn5Days() throws IOException;
}



