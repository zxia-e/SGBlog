package com.sangeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
import com.sangeng.mapper.ArticleMapper;
import com.sangeng.service.ArticleService;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService{

    @Override
    public ResponseResult hotArticleList() {
        //查寻热门文章  封装成ResponseResult返回

        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);

        //按照浏览量进行排序
        queryWrapper.orderByAsc(Article::getViewCount);

        //最多只查询10条
        Page<Article> page = new Page(1,10);
        page(page, queryWrapper);

        List<Article> articles = page.getRecords();
        return ResponseResult.okResult(articles);
    }
}
