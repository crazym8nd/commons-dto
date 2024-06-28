package com.crazym8nd.commonsdto.dto.response;

import com.crazym8nd.commonsdto.dto.IndividualDto;
import com.crazym8nd.commonsdto.dto.UserDto;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndividualInfoResponse {
    private UserDto userDto;
    private IndividualDto individualDto;
}
