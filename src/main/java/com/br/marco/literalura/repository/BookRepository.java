package com.br.marco.literalura.repository;

import com.br.marco.literalura.model.Author;
import com.br.marco.literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
		Optional<Book> findByTitleContainingIgnoreCase(String title);

		@Query("SELECT a FROM Book b JOIN b.authors a WHERE a.name ILIKE %:authorName%")
		Optional<Author> findAllAuthorsByName(String authorName);

		@Query("SELECT a FROM Book b JOIN b.authors a")
		List<Author> findAllAuthors();

		@Query("SELECT a FROM Book b JOIN b.authors a WHERE :year >= a.birthYear AND :year <= a.deathYear")
		List<Author> findAllAuthorsByYear(int year);

		@Query("SELECT b FROM Book b JOIN b.languages l WHERE l ILIKE %:lang%")
		List<Book> findAllBooksByLang(String lang);
}