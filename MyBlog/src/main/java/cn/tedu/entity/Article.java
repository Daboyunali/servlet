package cn.tedu.entity;

import java.text.SimpleDateFormat;
import java.util.List;

public class Article {
	private int oId;// 主键
	private String articleTitle;// 文章标题
	private String articleAbstract;// 文章摘要
	private int articleCommentCount;// 评论数量
	private int articleViewCount;// 浏览量
	private String articleContent;// 文章正文
	private int articlePutTop;// 是否置顶
	private String articleCreated;// 创建时间
	private long articleUpdated;// 修改时间
	private int articleRandomDouble;// 文章随机数
	private String username;// 作者名字

	private List<Tag> tags;// 关联的标签

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleAbstract() {
		return articleAbstract;
	}

	public void setArticleAbstract(String articleAbstract) {
		this.articleAbstract = articleAbstract;
	}

	public int getArticleCommentCount() {
		return articleCommentCount;
	}

	public void setArticleCommentCount(int articleCommentCount) {
		this.articleCommentCount = articleCommentCount;
	}

	public int getArticleViewCount() {
		return articleViewCount;
	}

	public void setArticleViewCount(int articleViewCount) {
		this.articleViewCount = articleViewCount;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public int getArticlePutTop() {
		return articlePutTop;
	}

	public void setArticlePutTop(int articlePutTop) {
		this.articlePutTop = articlePutTop;
	}

	public String getArticleCreated() {
		return articleCreated;
	}

	public void setArticleCreated(String articleCreated) {
		this.articleCreated = articleCreated;
	}

	public long getArticleUpdated() {
		return articleUpdated;
	}

	public void setArticleUpdated(long articleUpdated) {
		this.articleUpdated = articleUpdated;
	}

	public int getArticleRandomDouble() {
		return articleRandomDouble;
	}

	public void setArticleRandomDouble(int articleRandomDouble) {
		this.articleRandomDouble = articleRandomDouble;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Article(int oId, String articleTitle, String articleAbstract, int articleCommentCount, int articleViewCount,
			String articleContent, int articlePutTop, String result2, long articleUpdated, int articleRandomDouble,
			String username) {
		super();
		this.oId = oId;
		this.articleTitle = articleTitle;
		this.articleAbstract = articleAbstract;
		this.articleCommentCount = articleCommentCount;
		this.articleViewCount = articleViewCount;
		this.articleContent = articleContent;
		this.articlePutTop = articlePutTop;
		this.articleCreated = result2;
		this.articleUpdated = articleUpdated;
		this.articleRandomDouble = articleRandomDouble;
		this.username = username;
	}

	@Override
	public String toString() {
		return "Article [oId=" + oId + ", articleTitle=" + articleTitle + ", articleAbstract=" + articleAbstract
				+ ", articleCommentCount=" + articleCommentCount + ", articleViewCount=" + articleViewCount
				+ ", articleContent=" + articleContent + ", articlePutTop=" + articlePutTop + ", articleCreated="
				+ articleCreated + ", articleUpdated=" + articleUpdated + ", articleRandomDouble=" + articleRandomDouble
				+ ", username=" + username + "]";
	}

}
