package com.techmafia.pixx.domain.entity;

import com.techmafia.pixx.utils.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "pix_payments")
public class Pix {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "paid_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime paidAt;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "title")
    private String title;

    @Column(name = "reference")
    private String reference;

    @Column(name = "payment_url")
    private String urlPagamento;

    @Column(name = "key_type")
    private String tipoChavePix;

    @Column(name = "key")
    private String chavePix;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagt")
    private PaymentStatus statusPagt;
}
