//package com.productdock.rbc2024.service;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class Reminder {
//
//    @InjectMocks
//    private VehicleValidator vehicleValidator;
//
//    @Mock
//    private EnvkvValidator envkvValidator;
//
//    @Test
//    void validate() {
//        var vehicle = vehicle();
//        doNothing().when(envkvValidator).validate(vehicle);
//
//        vehicleValidator.validate(vehicle);
//
//        verify(envkvValidator, times(1)).validate(vehicle);
//    }
//
//    @Test
//    void republishDealer() {
//        var dealer = aDealer(DEALER_FOREIGN_ID_1);
//        doReturn(Optional.of(dealer)).when(dealerService).findByTenantIdAndByForeignId(any(), any());
//
//        republishService.republishDealer(dealer.getTenantId(), dealer.getForeignId());
//
//        verify(dealerService, times(1)).saveAndPublish(any());
//    }
//
//    @Test
//    void processBatchOfOldestPendingJobs_processingFailed() {
//        var updateJobs = List.of(validUpdateJob(), validUpdateJob());
//        var exception = createValidationException();
//        given(jobSynchronisationService.acquireBatchOfOldestPendingJobs(BATCH_SIZE)).willReturn(updateJobs);
//        doThrow(exception).when(vehicleService).generateVehicle(VEHICLE_ID_LONG);
//
//        jobProcessingService.processBatchOfOldestPendingJobs(BATCH_SIZE);
//
//        var invocationNumber = updateJobs.size();
//        verify(jobSynchronisationService, times(invocationNumber)).unlockJob(JOB_ID);
//    }
//
//    @Test
//    public void testExceptionThrown() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            // Code that should throw the exception
//            validateAge(-1);
//        });
//
//        // Check the exception message
//        assertEquals("Age cannot be negative", exception.getMessage());
//    }
//
//}
