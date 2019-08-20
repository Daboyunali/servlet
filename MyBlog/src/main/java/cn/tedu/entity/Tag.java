package cn.tedu.entity;

public class Tag {
	private int oId;// 主键
	private int tagReferenceCount;// 标签关联的文章计数
	private String tagTitle;// 标签标题

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public int getTagReferenceCount() {
		return tagReferenceCount;
	}

	public void setTagReferenceCount(int tagReferenceCount) {
		this.tagReferenceCount = tagReferenceCount;
	}

	public String getTagTitle() {
		return tagTitle;
	}

	public void setTagTitle(String tagTitle) {
		this.tagTitle = tagTitle;
	}

	@Override
	public String toString() {
		return "Tag [oId=" + oId + ", tagReferenceCount=" + tagReferenceCount + ", tagTitle=" + tagTitle + "]";
	}

	public Tag(int oId, int tagReferenceCount, String tagTitle) {
		super();
		this.oId = oId;
		this.tagReferenceCount = tagReferenceCount;
		this.tagTitle = tagTitle;
	}

}
