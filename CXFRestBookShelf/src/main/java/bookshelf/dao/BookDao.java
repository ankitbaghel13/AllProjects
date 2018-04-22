package bookshelf.dao;

import bookshelf.vo.BookVO;

public class BookDao {
	
	BookVO bookVO = new BookVO();

	public BookVO getBookDetails(String name){
		System.out.println("Inside DAO getBookDetails method");
		
		if(name.equalsIgnoreCase("DaVinciCode")){
			bookVO.setAuthor("Leonardo");
			bookVO.setBookId(398467564783l);
			bookVO.setBookName(name);
		}
		else{
			bookVO.setAuthor("na");
			bookVO.setBookId(1l);
			bookVO.setBookName(name);
		}
		return bookVO;
	}
	
	public BookVO addBook(String bookName, String author){
		System.out.println("Inside DAO addBook method");
		
		bookVO.setAuthor(author);
		bookVO.setBookId(346737373732l);
		bookVO.setBookName(bookName);
		return bookVO;
	}
}
