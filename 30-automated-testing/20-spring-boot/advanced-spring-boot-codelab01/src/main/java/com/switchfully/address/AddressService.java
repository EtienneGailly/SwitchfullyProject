package com.switchfully.address;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@Component
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public UUID createAddress(CreateAddressDTO addressDTO) {
        Address savedAddress = addressRepository.save(toEntity(addressDTO));
        return savedAddress.getId();
    }

    public List<AddressDTO> getAllAddresses() {
        return addressRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public AddressDTO getAddress(UUID id) {
        return toDTO(addressRepository.getReferenceById(id));
    }

    public void deleteAddress(UUID id) {
        addressRepository.deleteById(id);
    }

    private Address toEntity(CreateAddressDTO addressDTO) {
        return new Address(addressDTO.streetName(), addressDTO.number(), addressDTO.zipCode(), addressDTO.city());
    }

    private AddressDTO toDTO(Address address) {
        return new AddressDTO(address.getId(), address.getStreetName(), address.getNumber(), address.getZipCode(), address.getCity());
    }
}
