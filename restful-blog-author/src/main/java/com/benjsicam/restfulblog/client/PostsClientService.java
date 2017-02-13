package com.benjsicam.restfulblog.client;

        import com.benjsicam.restfulblog.domain.Post;
        import org.springframework.cloud.netflix.feign.FeignClient;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import java.util.List;

@FeignClient(name="monolith",configuration = FeingClientConfiguration.class)
public interface PostsClientService {

    @RequestMapping(method = RequestMethod.GET, value="/resources/post/author/{authorId}")
    List<Post> findByAuthor(@PathVariable("authorId") Long authorId);
}
