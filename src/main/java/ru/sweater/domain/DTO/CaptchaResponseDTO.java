package ru.sweater.domain.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Created by Алексей on 05.07.2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptchaResponseDTO {
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Set<String> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Set<String> errorCode) {
        this.errorCode = errorCode;
    }

    @JsonAlias("error-codes")
    private Set<String> errorCode;

}
