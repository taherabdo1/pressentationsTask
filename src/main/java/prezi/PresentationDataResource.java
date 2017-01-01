package prezi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PresentationDataResource {

	@RequestMapping(method = RequestMethod.GET, value = "/presentations")
	public void getAllPresentationsService(HttpServletResponse response) {
        byte[] buf = new byte[8192];
        int c = 0;
		try{
        ApplicationContext appContext =
         	   new ClassPathXmlApplicationContext(new String[]{});

         	Resource resource =
            appContext.getResource("classpath:prezis.json");
			InputStream fin = resource.getInputStream();
		    OutputStream writer = response.getOutputStream();
			response.setHeader("Status", "200");		    
			while ((c = fin.read(buf, 0, buf.length)) > 0) {
				writer.write(buf, 0, c);
	        }
            writer.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
