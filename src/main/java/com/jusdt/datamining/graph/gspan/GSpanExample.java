package com.jusdt.datamining.graph.gspan;

/**
 * gSpan频繁子图挖掘算法
 */
public class GSpanExample {

	public static void main(String[] args) {
		//测试数据文件地址
		String filePath = "data/gspan/input.txt";
		//最小支持度率
		double minSupportRate = 0.2;

		GSpanTool tool = new GSpanTool(filePath, minSupportRate);
		tool.freqGraphMining();
	}

}
