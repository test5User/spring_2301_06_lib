package by.itclass.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class BookInLibrary {
    private String title;
    private int pages;
    @NonNull
    private int library_id;
}
