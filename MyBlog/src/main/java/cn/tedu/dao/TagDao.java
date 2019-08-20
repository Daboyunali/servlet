package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.tedu.entity.Tag;
import cn.tedu.utils.DBUtils;

public class TagDao {
	public List<Tag> getTagsByArticleId(int oId) {
		ArrayList<Tag> list = new ArrayList<Tag>();
		// 获取连接 并自动关闭
		try (Connection conne = DBUtils.getConn()) {
			String sql = "select t.oId,t.tagTitle from blogs_tag t join blogs_tag_article ta on t.oid=ta.tag_oid where ta.article_oid=?";
			PreparedStatement ps = conne.prepareStatement(sql);
			ps.setInt(1, oId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int tagId = rs.getInt(1);
				String tagTitle = rs.getString(2);
				list.add(new Tag(oId, 0, tagTitle));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
