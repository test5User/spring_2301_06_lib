package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "library")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @OneToMany(mappedBy = "library", fetch = FetchType.EAGER)
    private List<Book> books;
}
