package post;

import java.sql.Timestamp;

// 하나의 게시글 데이터를 받는 클래스
// 해당 클래스를 서버에 전달하고 싶다.
// 객체를 전달하려면 Serializable 인터페이스를 구현한다고 선언해주면 된다고 하던데...
// 과연? 그런진 모르겠다. 해당 이론을 좀 알고 싶다.
// 데이터베이스에서 데이터를 넣을 때도 해당 객체를 사용하고 싶다.
// 제목, 작성자, 내용, 작성날짜를 대입해야겠다.
// Oracle sql date 타입은?
// 8버전 이후로는 Date 타입보다는 Timestamp 타입을 쓰는게, 다양한 정보를 더 담을 수 있어서 좋다.
// Date 타입은 연 월 일 정보만 있다고 했다.
public class Post {
	private int id; // 게시글 번호. 데이터베이스에서 가져올 데이터이다. 
	private String subject; // 게시글 제목
	private String writerName; // 
	private String content;
	private Timestamp writeDate;
	
	// 내용물이 없는 경우에 사용하기 위해 만드는 생성자.
	public Post() {
		
	}
	
	// 내용물을 넣는 생성자.(클라이언트에서 대입하는 것)
	public Post(String subject, String writerName, String content, Timestamp writeDate) {
		this.subject = subject;
		this.writerName = writerName;
		this.content = content;
		this.writeDate = writeDate;
	}
	
	// 데이터베이스에서 가져온 데이터를 담는 생성자.(서버에서 대입) 
	public Post(int id, String subject, String writerName, String content, Timestamp writeDate) {
		this.id = id;
		this.subject = subject;
		this.writerName = writerName;
		this.content = content;
		this.writeDate = writeDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}

	// 내용물이 있을 경우, 해당 메서드를 활용
	@Override
	public String toString() {
		return "  | " + id +
				" | " + subject +
				" | " + writerName +
				" | " + writeDate;
	}
	
	// 내용물이 없을 때, 해당 메서드를 활용할 것이다.
	public String isNullStr() {
		return "  |         |             |          |          |";
	}
}
