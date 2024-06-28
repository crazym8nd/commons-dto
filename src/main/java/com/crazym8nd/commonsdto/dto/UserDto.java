package com.crazym8nd.commonsdto.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private UUID id;

    private String secretKey;
    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime verifiedAt;
    private boolean filled;
    private AddressDto address;

}
