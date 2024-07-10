package mpapp.bootstrap;

import mpapp.entity.Payment;
import mpapp.entity.PaymentDetail;
import mpapp.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

import static mpapp.enums.Status.SUCCESS;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment payment01 = new Payment(LocalDate.now(), new BigDecimal(1000), SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(2000), new BigDecimal(3000), LocalDate.now());
        payment01.setPaymentDetail(paymentDetail1);

        Payment payment02 = new Payment(LocalDate.now(), new BigDecimal(4000), SUCCESS);
        PaymentDetail paymentDetail02 = new PaymentDetail(new BigDecimal(5000), new BigDecimal(6000), LocalDate.now());
        payment02.setPaymentDetail(paymentDetail02);

        paymentRepository.save(payment01);
        paymentRepository.save(payment02);
    }
}
