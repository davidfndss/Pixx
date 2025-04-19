package com.techmafia.pixx.domain.dto;

import com.techmafia.pixx.utils.enums.PaymentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PixDTO {
    private String key_type;

    private String key;
    private String name = "Pixx.";
    private String city = "Brasil";

    @NotNull(message = "O valor não pode ser nulo")
    private String amount;

    private String reference = "Pagamento gerado pela GSIPAY";

    private String paymentUrl;

    private PaymentStatus paymentStatus;

    public PixDTO(String key_type, String key, String amount) {
        this.key_type = key_type;
        this.key = key;
        this.amount = amount;
    }
}
