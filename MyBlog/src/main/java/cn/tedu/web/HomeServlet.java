package cn.tedu.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.context.Context;

import cn.tedu.dao.ArticleDao;
import cn.tedu.entity.Article;
import cn.tedu.utils.ThyUtils;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取首页文章列表
		ArticleDao articleDao = new ArticleDao();
		List<Article> list = articleDao.getHomeList();
		
		//获取2~4篇文章数据
		List<Article> list2=new ArrayList<Article>();
		for (int i = 1; i < 4; i++) {
			list2.add(list.get(i));
		}
		//获取5~8篇文章数据
		List<Article> list3=new ArrayList<Article>();
		for (int i = 4; i < 8; i++) {
			list3.add(list.get(i));
		}
		// 把第一篇文章取出传递给页面
		Context context = new Context();
		context.setVariable("first", list.get(0));
		context.setVariable("two", list2);
		context.setVariable("three", list3);

		ThyUtils.write("blog/index11", response, context);
	}

}
