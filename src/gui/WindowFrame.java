package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import lms.BooksManager;

public class WindowFrame extends JFrame {

	BooksManager booksManager;

	
	MenuSelection menuselection;
	BookAdder bookadder;
	BookViewer bookviewer;

	
	public WindowFrame(BooksManager booksManager) {
		
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		
		this.booksManager = booksManager;
		menuselection = new MenuSelection(this);
		bookadder = new BookAdder(this);
		bookviewer = new BookViewer(this,this.booksManager);
		
		this.add(menuselection);
		
		this.setVisible(true);

	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getBookadder() {
		return bookadder;
	}

	public void setBookadder(BookAdder bookadder) {
		this.bookadder = bookadder;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}

}
