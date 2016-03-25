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
				dff.setRepository(tmpDir);//ָ���ϴ��ļ���ʱĿ¼
				dff.setSizeThreshold(1024000);//ָ���ڴ��л������ݵĴ�С��byte
				ServletFileUpload sfu = new ServletFileUpload(dff);
				sfu.setFileSizeMax(50000000);//���õ����ļ������ֵ
				sfu.setSizeMax(10000000);//ָ��һ���ϴ�����ļ����ܳߴ�
				FileItemIterator fii = sfu.getItemIterator(request);
				while(fii.hasNext()){
					FileItemStream fis = fii.next();
					System.out.println(fis.getName());
					if(!fis.isFormField()&&fis.getName().length()>0){
						//���˱��з��ļ��ĵ��ֶ�
						//����ϴ��ļ����ļ���
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
				//��ֹҳ���������syntax error
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
