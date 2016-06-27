/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.huan.controller;

import com.huan.model.UserInfo;
import com.huan.service.MainPageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhanhuanhuan
 */
@Controller
public class MainPageController {
    private static final Logger logger = LoggerFactory.getLogger(MainPageController.class);

    @Autowired
    private MainPageService mainPageService;

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        UserInfo user = mainPageService.selectUserDetail();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = {"about", "about.html"}, method = RequestMethod.GET)
    public String about(ModelMap modelMap) {
        modelMap.put("name", "huanhuan");
        return "about";
    }

    @RequestMapping(value = {"new", "new.html"}, method = RequestMethod.GET)
    public String newArticle() {
        return "new";
    }

    @RequestMapping(value = {"newlist", "newlist.html"}, method = RequestMethod.GET)
    public String newArticleList() {
        return "newlist";
    }

    @RequestMapping(value = {"share", "share.html"}, method = RequestMethod.GET)
    public String share() {
        return "share";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<UserInfo> selectAll() {
        return mainPageService.selectAll();
    }

    @RequestMapping("logtest")
    public @ResponseBody void logtest() {
        logger.debug("------------debug test ");
        logger.info("------------info test ");
        logger.warn("------------warn test ");
        logger.error("error test message", new Exception("Testing"));
    }
}
