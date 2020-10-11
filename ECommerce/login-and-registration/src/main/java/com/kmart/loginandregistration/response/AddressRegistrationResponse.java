package com.kmart.loginandregistration.response;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AddressRegistrationResponse {
 private String country;
 private String state;
 private String city;
 private long pincode;
 private String street;
 private String landmark;
}
