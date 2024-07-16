package myapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Getter
@Setter
public class PaymentDetail {

    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayoutAmount, LocalDate payoutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payoutDate = payoutDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal commissionAmount;
    private BigDecimal merchantPayoutAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

}
