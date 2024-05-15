package org.serratec.backend.bibliotecavittorio.repository;

import org.serratec.backend.bibliotecavittorio.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
