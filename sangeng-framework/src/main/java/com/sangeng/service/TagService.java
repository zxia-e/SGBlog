package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.dto.TagListDto;
import com.sangeng.domain.entity.Tag;
import com.sangeng.domain.vo.PageVo;


/**
 * 标签(Tag)表服务接口
 *
 * @author makejava
 * @since 2023-04-26 13:38:34
 */
public interface TagService extends IService<Tag> {

    ResponseResult<PageVo> pageTagList(int pageNum, int pageSize, TagListDto tagListDto);
}
