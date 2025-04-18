package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @NotBlank
    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
    // Spring Boot 3.x이상부터는 jakarta import
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*\\d).*$",
        message = "비밀번호는 최소 하나의 대문자와 숫자를 포함해야 합니다."
    )
    private String newPassword;
}
