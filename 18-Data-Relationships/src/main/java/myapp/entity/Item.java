package myapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;

    @ManyToMany
    @JoinTable(name = "cart_item_rel", joinColumns = @JoinColumn(name = "i_id"), inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Cart> cartList;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
