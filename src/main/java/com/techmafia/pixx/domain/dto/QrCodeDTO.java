package com.techmafia.pixx.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QrCodeDTO {
    private String qrcodeBase64;
    private String code;
    private String link;
}
