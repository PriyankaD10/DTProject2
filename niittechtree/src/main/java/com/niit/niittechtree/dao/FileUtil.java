package com.niit.niittechtree.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
public static void uploadFile(String path, MultipartFile file, String filename){
	
	if(file!=null){
		InputStream in=null;
		OutputStream out=null;
		
		if(file.getSize()>0){
			
			try{
				
				in=file.getInputStream();
				out=new FileOutputStream(path+filename);
				int readBytes=0;
				byte [] buffer=new byte[510592];
				while((readBytes=in.read(buffer,0,in.available()))!=-1){
					out.write(buffer,0, readBytes);
				}
			}
			catch(IOException e){
				
				e.printStackTrace();
			}
			finally{
				
				try {
					in.close();
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
}
