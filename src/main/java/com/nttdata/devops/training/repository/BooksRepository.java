package com.nttdata.devops.training.repository;
import org.springframework.data.repository.CrudRepository;

import com.nttdata.devops.training.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
