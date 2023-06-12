package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.BookInput;
import lms.BooksManager;

public class BookViewer extends JPanel {
	
	WindowFrame frame;

	BooksManager booksManager;

	public BookViewer(WindowFrame frame, BooksManager booksManager) {
		
		this.frame = frame;
		this.booksManager = booksManager;
		
		System.out.println("***" + booksManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");

		for(int i =0; i<booksManager.size(); i++) {
			Vector row = new Vector();
			BookInput bi = booksManager.get(i);
			row.add(bi.getId());
			row.add(bi.getTitle());
			row.add(bi.getDate());
			row.add(bi.getUserId());
			model.addRow(row);
		}
	
	JTable table = new JTable(model);
	JScrollPane sp = new JScrollPane(table);
	
	
	this.add(sp);
	
	this.setSize(300, 300);
	this.setVisible(true);

	}
}