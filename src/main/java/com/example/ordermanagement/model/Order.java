package com.example.ordermanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String orderNumber;
    private String name;
    private String phone;
    private String model;
    private Integer period;

    @Enumerated(EnumType.STRING)
    private RiskStatus riskStatus; // PASSED, FAILED
    
    private Boolean cancelBeforeDispatch = false;
    private Boolean intercepted = false;
    private String cancellationReason;
    private Double orderAmount;
    private Double buyoutPrice;
    private String paymentMethod; // 付款方式
    private Double monthlyPayment;
    private String supplier;
    private String remarks;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    public enum RiskStatus {
        PASSED, FAILED;
    }
}