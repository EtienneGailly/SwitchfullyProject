package com.switchfully.address;

import java.util.UUID;

public record AddressDTO(UUID id, String streetName, String number, String zipCode, String city) {
}
