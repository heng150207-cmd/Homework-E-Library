package kh.edu.istad.homeworkelearning.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true ,nullable = false, length = 30)
    private String name;

    @Column(length = 255)
    private String icon;
    @Column(nullable = false)
    private Boolean is_deleated;
}
