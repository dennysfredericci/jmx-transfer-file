package br.com.fredericci.jmx;

import java.io.File;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class FileServer {

	@ManagedOperation(description = "Returns something.")
	public String[] listFiles() {
		File file = new File("./src/main/resources/files");
		return file.list();
	}
	
	@ManagedOperation
	public File getFile(String name) {
		return new File("./scr/main/resources/files/pom.xml");
	}
		
}
