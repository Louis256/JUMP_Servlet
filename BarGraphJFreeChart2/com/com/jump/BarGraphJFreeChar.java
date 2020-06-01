package com.jump;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Servlet implementation class BarGraphJFreeChar
 */
public class BarGraphJFreeChar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BarGraphJFreeChar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/png");		
        OutputStream os = response.getOutputStream();
        JFreeChart chart = getChart();
        int width = 600;
        int height = 300;
        ChartUtils.writeChartAsPNG(os, chart, width, height);
    }

    public JFreeChart getChart() {
    	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(103, "Scores", "Yankees");
        dataset.setValue(67, "Scores", "Blue Jays");
        dataset.setValue(96, "Scores", "Rays");
        dataset.setValue(54, "Scores", "Orioles");
        dataset.setValue(84, "Scores", "Red Sox");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Baseball Scores Season 2019",
                "",
                "Scores",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.cyan);
        return barChart;
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
