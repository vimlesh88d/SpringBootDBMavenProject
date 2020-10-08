package com.nttdata.devops.training.service;

import com.nttdata.devops.training.controller.BooksController;
import com.nttdata.devops.training.model.Books;
import com.nttdata.devops.training.repository.BooksRepository;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.nttdata.devops.training.service.BooksService;

@RunWith(MockitoJUnitRunner.class)
public class BooksServiceTest {
	
	@Mock
	private BooksRepository booksRepository;
	@Mock
	private BooksService booksService;
	
	@Test
	public void getAllBooksTest() throws Exception {

		List<Books> listOfBooks = booksService.getAllBooks();
	}
	
	@Test
	public void getBooksByIdTest() throws Exception {
		
		Books books = booksService.getBooksById(01);
	
	}

}
