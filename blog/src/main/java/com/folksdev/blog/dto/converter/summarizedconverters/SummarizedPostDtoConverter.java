package com.folksdev.blog.dto.converter.summarizedconverters;

import com.folksdev.blog.dto.summarizeddtos.SummarizedPostDto;
import com.folksdev.blog.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class SummarizedPostDtoConverter {

    public SummarizedPostDto convert(Post from){
        return new SummarizedPostDto(
                from.getPost_id(),
                from.getPost_content(),
                from.getPost_date()
        );
    }
}
