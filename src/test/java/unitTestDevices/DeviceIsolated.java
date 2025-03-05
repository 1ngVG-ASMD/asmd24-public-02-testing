package unitTestDevices;

import devices.Device;
import devices.FailingPolicy;
import devices.StandardDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import tdd.DeviceImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeviceIsolated {


    @Mock
    FailingPolicy stubFailingPolicy;
    private Device device = new StandardDevice(stubFailingPolicy);

    @Test
    @DisplayName("Turn On the device")
    void testOn(){
        if(!device.isOn()) device.on();
        assertTrue(device.isOn());
    }

    @Test
    @DisplayName("Turn Off the device")
    void testOff(){
        device.off();
        assertFalse(device.isOn());
    }
}
