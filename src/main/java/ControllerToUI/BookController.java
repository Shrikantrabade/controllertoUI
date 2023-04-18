package ControllerToUI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ControllerToUImodel.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public ModelAndView getbookdata() {
		
		Book book=new Book();
		book.setBookid(111);
		book.setBookname("java");
		book.setBookprice(475.00);
		
		
		ModelAndView mva=new ModelAndView();
		mva.setViewName("book");
		mva.addObject("BOOK", book);
		return mva;
		
	}
	
	@GetMapping("/getbook") 
	public String getBooks(Model model) {
		
		

		Book book=new Book();
		book.setBookid(111);
		book.setBookname("java");
		book.setBookprice(475.00);
		

		Book book1=new Book();
		book1.setBookid(111);
		book1.setBookname("java");
		book1.setBookprice(475.00);
		

		Book book2=new Book();
		book2.setBookid(111);
		book2.setBookname("java");
		book2.setBookprice(475.00);
		
		
		List<Book> list=new ArrayList();
		list.add(book);
		list.add(book1);
		list.add(book2);
		
		model.addAttribute("Books", list);
		
		
		return "books";
		
		
	}
	
}
