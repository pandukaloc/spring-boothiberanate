package com.test.panduka.pandukaloc.repository;

import com.test.panduka.pandukaloc.modal.Note;
import org.springframework.data.jpa.repository.JpaRepository;



public interface NoteRepository extends JpaRepository<Note, Long> {
}
