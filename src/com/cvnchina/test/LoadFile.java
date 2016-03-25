package com.cvnchina.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

public class LoadFile extends HttpServlet {
	File tmpDir = null;
	File saveDir = null;
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("test");
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		try{
			if(ServletFileUpload.isMultipartContent(request)){
				System.out.println("------");
				DiskFileItemFactory dff = new DiskFileItemFactory();
				dff.setRepository(tmpDir);//指定上传文件临时目录
				dff.setSizeThreshold(1024000);//指定内存中缓存数据的大小，byte
				ServletFileUpload sfu = new ServletFileUpload(dff);
				sfu.setFileSizeMax(50000000);//设置单个文件的最大值
				sfu.setSizeMax(10000000);//指定一次上传多个文件的总尺寸
				FileItemIterator fii = sfu.getItemIterator(request);
				while(fii.hasNext()){
					FileItemStream fis = fii.next();
					System.out.println(fis.getName());
					if(!fis.isFormField()&&fis.getName().length()>0){
						//过滤表单中非文件的的字段
						//获得上传文件的文件名
						String fileName = fis.getName().substring(fis.getName().lastIndexOf("\\")==-1?0:fis.getName().lastIndexOf("\\"));
						BufferedInputStream in = new BufferedInputStream(fis.openStream());
						File filename = new File(saveDir+"\\"+fileName);
						
						BufferedOutputStream out = new BufferedOutputStream(
								new FileOutputStream(filename));
//						System.out.println(in+" "+ out);
						Streams.copy(in, out, true);
						System.out.println("----"+filename.getAbsolutePath());
					}
				}
				//防止页面解析出现syntax error
//				response.getWriter().println("{name:'asdsd'}");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void init() throws ServletException {
		super.init();
		String tmpPath = "d:\\tmpdir";
		String savePath = "d:\\updir";
		tmpDir = new File (tmpPath);
		saveDir = new File(savePath);
		if(!tmpDir.isDirectory()){
			tmpDir.mkdir();
		}
		if(!saveDir.isDirectory()){
			saveDir.mkdir();
		}
	}
}
