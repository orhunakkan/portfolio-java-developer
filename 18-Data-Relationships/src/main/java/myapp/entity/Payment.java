package myapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import myapp.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "payments")
public class Payment {

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;

}
