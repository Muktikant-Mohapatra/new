package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNumber {
  public ModelAndView add(@RequestParam(t1) int t1,@RequestParam(t2) int t2) {
	  int k=t1+t2;
	  ModelAndView mv=new ModelAndView();
	  mv.addObject(k);
	  mv.setView("display.jsp");
	  return
  }
}
