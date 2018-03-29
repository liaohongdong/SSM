package cn.liaohongdong.ssm.web;

import cn.liaohongdong.ssm.dto.AppointExecution;
import cn.liaohongdong.ssm.dto.Result;
import cn.liaohongdong.ssm.entity.Appointment;
import cn.liaohongdong.ssm.entity.Book;
import cn.liaohongdong.ssm.enums.AppointStateEnum;
import cn.liaohongdong.ssm.exception.NoNumberException;
import cn.liaohongdong.ssm.exception.RepeatAppointException;
import cn.liaohongdong.ssm.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        logger.info("gagaggagga11111111111111");
        List<Book> list = bookService.getList();
        model.addAttribute(list);
        return "list";
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model) {
        if (bookId == null) {
            return "redirect:/book/list";
        }
        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";
    }

    //ajax json
    @ResponseBody
    @RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId") Long studentId) {
        if (studentId == null || studentId.equals("")) {
            return new Result(false, "学号不能为空");
        }
        AppointExecution execution = null;
        try {
            execution = bookService.appoint(bookId, studentId);
        } catch (NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        } catch (RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        } catch (Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);
    }
}
