package com.champsoft.vrms2432714.modules.owners.api.dto;

import jakarta.validation.constraints.NotBlank;

public record UpdateOwnerRequest(
        @NotBlank String fullName,
        String address) {}