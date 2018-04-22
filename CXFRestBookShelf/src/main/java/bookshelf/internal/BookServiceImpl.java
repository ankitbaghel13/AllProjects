package bookshelf.internal;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import bookshelf.BookService;
import bookshelf.dao.BookDao;

public class BookServiceImpl implements BookService{
	
	protected final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	BookDao bookDao;

	@Override
	public Response getBucket(String name) {
		System.out.println("Inside getBucket "+name);
		log.debug("name = "+name);
		
		if(name == null){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(bookDao.getBookDetails(name)).build();
	}

	@Override
	public Response addBook(String bookName, String author) {
		System.out.println("Inside addBook "+bookName+ " "+author);
		log.debug("bookName = "+bookName+" ,author = "+author);

		if(bookName == null && author == null){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(bookDao.addBook(bookName, author)).build();
	}

}
