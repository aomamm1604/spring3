package web;
import java.util.ArrayList;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController 
{

	@RequestMapping("/")
	String index() 
        {
		return "index";
        }     
        @RequestMapping("/test1") @ResponseBody
	Book test1() 
        {
		Book  b = new Book();
		b.setTitle("Hello");
		b.setPrice(199);
		return b;
	}
        
        @RequestMapping("/test2") @ResponseBody
	ArrayList test2() 
        {
		ArrayList list = new ArrayList();

		Book  b1 = new Book();
		b1.setTitle("Hello");
		b1.setPrice(199);

		Book  b2 = new Book();
		b2.setTitle("Hello World");
		b2.setPrice(199);

		list.add(b1);
		list.add(b2);
		return list;
	}
        
      
}

