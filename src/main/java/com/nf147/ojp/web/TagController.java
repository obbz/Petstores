package com.nf147.ojp.web;

import com.nf147.ojp.dao.TagMapper;
import com.nf147.ojp.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagMapper tagMapper;

    @GetMapping
    @ResponseBody
    public List<Tag> getTag(Model model){
        List<Tag> list = tagMapper.selectAll();
        return list;
    }
}
