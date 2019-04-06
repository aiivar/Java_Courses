package com.company.controllers;

import com.company.Option;
import com.company.Poll;

import com.company.dao.OptionDao;
import com.company.dao.PollsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by roi on 4/6/2019.
 */
@Controller
public class PollController {
    @Autowired
    PollsDao pollsDao;

    @Autowired
    OptionDao optionDao;
    @GetMapping("/vote")
    String vote(Integer optionId){
        optionDao.addVote(optionId);
        return "redirect/:";
    }

    @GetMapping("/")
    String allPolls(Model model){
        List<Poll> allPolls = pollsDao.findAll();
        model.addAttribute("pollList", allPolls);
        return "all_polls_page";
    }

    @GetMapping("/options")
    String getOptions(Model model, @RequestParam Integer pollId){
        List<Option> options = optionDao.findOptionsByPollId(pollId);
        model.addAttribute("optionList", options);
        return "options_page";
    }
}
