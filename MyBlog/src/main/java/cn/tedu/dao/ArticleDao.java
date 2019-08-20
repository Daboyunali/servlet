package cn.tedu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import cn.tedu.entity.Article;
import cn.tedu.utils.DBUtils;

public class ArticleDao {
	public List<Article> getHomeList() {
		ArrayList<Article> list = new ArrayList<Article>();

		// 获取连接 并自动关闭
		try (Connection conne = DBUtils.getConn()) {
			String sql = "select a.oid,a.articletitle,a.articleabstract,a.articlecommentcount,a.articleviewcount,a.articlecontent,"
					+ "a.articleputtop,a.articlecreated,a.articleupdated,a.articlerandomdouble,u.username "
					+ "from blogs_article a join blogs_user u on a.articleauthorid=u.oid "
					+ "order by articleputtop desc,articlecreated desc limit 0,8";
			Statement state = conne.createStatement();
			ResultSet rs = state.executeQuery(sql);
			while (rs.next()) {
				int oId = rs.getInt(1);
				String title = rs.getString(2);
				String articleAbstract = rs.getString(3);
				int commentCount = rs.getInt(4);
				int viewCount = rs.getInt(5);
				String content = rs.getString(6);
				int putTop = rs.getInt(7);
				long created = rs.getLong(8);
			    String result2 = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(created);
				
				long updated = rs.getLong(9);
				int random = rs.getInt(10);
				String username = rs.getString(11);
				Article a = new Article(oId, title, articleAbstract, commentCount, viewCount, content, putTop, result2,
						updated, random, username);
				//查询该文章关联的标签
				TagDao tagDao=new TagDao();
				a.setTags(tagDao.getTagsByArticleId(oId));
				
				list.add(a);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
