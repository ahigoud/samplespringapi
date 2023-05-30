 package com.ps.app1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/book")
	public Book getBook() {
		Book book = new Book(1, "Java", "Learn Spring boot ");
		return book;
	}
	@PostMapping("/post")
	
	public Book createBook(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getTitle());
		System.out.println(book.getDesc());
		return book;
	}
	@PutMapping("/put/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable int id,@RequestBody Book updateBook){
		System.out.println(updateBook.getId());
		System.out.println(updateBook.getTitle());
		System.out.println(updateBook.getDesc());
		return ResponseEntity.ok(updateBook);
		
	}
	@DeleteMapping(value="/books/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id){
		return ResponseEntity.ok("book deleted successfully");
	}
	@GetMapping("/books/{id}/{title}/{desc}")
	public ResponseEntity<Book> pathvaribaleDemo(@PathVariable int id,
			@PathVariable ("title")String booktitle,
			@PathVariable String desc){
		Book b=new Book(id,booktitle,desc);
		b.setId(id);
		b.setTitle(booktitle);
		b.setDesc(desc);
		
		System.out.println(id);
		System.out.println(booktitle);
		System.out.println(desc);
	
		return ResponseEntity.ok(b);
	}
	@GetMapping("/book/query")
	public ResponseEntity<Book> requestparam(
			@RequestParam(name="id") int id,
			@RequestParam(name="title") String title, 
			@RequestParam(name="desc") String desc){
		System.out.println(id);
		System.out.println(title);
		System.out.println(desc);
		Book book=new Book(id,title,desc);
		book.setId(id);
		book.setTitle(title);
		book.setDesc(desc);
		return ResponseEntity.ok(book);
		
	}

}
