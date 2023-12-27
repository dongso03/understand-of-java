
public class DocumentsShelf {
	private DocumentsShelf document1;
	private DocumentsShelf document2;
	private DocumentsShelf garbage;

	public DocumentsShelf getDocument1() {
		return document1;
	}

	public void setDocument1(Documents document1) {
		if(document1.getRank() >1) {
			this.garbage = this.document1;
		}
		this.document1 = document1;
	}

	public DocumentsShelf getDocument2() {
		return document2;
	}

	public void setDocument2(DocumentsShelf document2) {
		this.document2 = document2;
	}

}
