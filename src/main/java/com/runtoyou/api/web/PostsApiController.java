package com.runtoyou.api.web;

import com.runtoyou.api.service.PostsService;
import com.runtoyou.api.web.dto.PostsListResponseDto;
import com.runtoyou.api.web.dto.PostsResponseDto;
import com.runtoyou.api.web.dto.PostsSaveRequestDto;
import com.runtoyou.api.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @GetMapping("/api/v1/posts/")
    public List<PostsListResponseDto> findAllDesc() {
        return postsService.findAllDesc();
    }
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
