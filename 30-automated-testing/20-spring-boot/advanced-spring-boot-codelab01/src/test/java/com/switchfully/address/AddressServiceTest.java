package com.switchfully.address;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AddressServiceTest {

    private AddressService addressService;
    private AddressRepository addressRepository;

    /**
     * This is to reset the database after each test
     */
    @AfterEach
    void tearDown() {
        addressRepository.deleteAll();
    }

    @Test
    void saveAddress() {
        //GIVEN

        // Create a CreateAddressDTO object

        //WHEN

        //Call the createAddress method on the service and save the returned id in a variable

        //THEN

        //Check if the created address exists by calling getAddress using the id
        //Check if the fields of the address are correct
    }

    @Test
    void getAddress() {
        //GIVEN

        // Create two addresses using the service, save the id of one of them

        //WHEN

        // Get one of the two addresses using the getAddress method on the service

        //THEN

        // See that the correct address has been returned by checking its fields
    }

    @Test
    void findAllAddresses() {
        //GIVEN

        // Create two addresses using the service

        //WHEN

        // Get all the addresses using the service

        //THEN

        // Check if all the addresses have been returned
    }

    @Test
    void deleteAddress() {
        //GIVEN

        // Create an address

        //WHEN

        // Delete the address you've just created

        //THEN

        // Check that getting this deleted address will return an error
    }
}
