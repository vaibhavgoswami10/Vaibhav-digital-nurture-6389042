package com.cognizant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    ExternalApi externalApi;

    @InjectMocks
    MyService myService;

    @Test
    public void testFetchDataReturnsMockedValue() {
        when(externalApi.getData()).thenReturn("Mock Data");

        String result = myService.fetchData();

        assertEquals("Mock Data", result);
        verify(externalApi).getData();
    }

    @Test
    public void testSendCalledWithSpecificArgument() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Use the mock in the service
        MyService service = new MyService(mockApi);
        service.process();

        // Step 3: Verify interaction with specific argument
        verify(mockApi).send("Hello, Mockito!");
    }
}
