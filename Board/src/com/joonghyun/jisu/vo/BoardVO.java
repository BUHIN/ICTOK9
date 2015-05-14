package com.joonghyun.jisu.vo;

public class BoardVO {
	private int bseq;
	private String id;
	private String btitle;
	private String bcontent;
	private String bdate;
	public BoardVO() {
	}
	public BoardVO(int bseq, String id, String btitle, String bcontent,
			String bdate) {
		super();
		this.bseq = bseq;
		this.id = id;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
	}
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "BoardVO [bseq=" + bseq + ", id=" + id + ", btitle=" + btitle
				+ ", bcontent=" + bcontent + ", bdate=" + bdate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bcontent == null) ? 0 : bcontent.hashCode());
		result = prime * result + ((bdate == null) ? 0 : bdate.hashCode());
		result = prime * result + bseq;
		result = prime * result + ((btitle == null) ? 0 : btitle.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (bcontent == null) {
			if (other.bcontent != null)
				return false;
		} else if (!bcontent.equals(other.bcontent))
			return false;
		if (bdate == null) {
			if (other.bdate != null)
				return false;
		} else if (!bdate.equals(other.bdate))
			return false;
		if (bseq != other.bseq)
			return false;
		if (btitle == null) {
			if (other.btitle != null)
				return false;
		} else if (!btitle.equals(other.btitle))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
