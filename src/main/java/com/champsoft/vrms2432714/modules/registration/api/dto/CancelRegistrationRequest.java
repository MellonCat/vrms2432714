package com.champsoft.vrms2432714.modules.registration.api.dto;

import jakarta.validation.constraints.NotBlank;

public record CancelRegistrationRequest(
        @NotBlank String id
) {
    /**
     * Backward-compatible accessor for earlier naming.
     */
    public String registrationId() {
        return id;
    }
}