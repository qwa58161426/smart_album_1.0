package com.zhitu.service;

import com.zhitu.entity.Album;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 相册服务
 */
public interface AlbumService {

    void create(int userId, String name, String description);

    void edit(int userId, int albumId, String name, int photoId, String description);

    void delete(int userId, int albumId);

    void download(int albumId, HttpServletResponse response);

    Map<String, Object> getAlbumPhotos(int userId, int albumId, int page);

    List<Album> getAlbumList(int userId);

    void merge(int userId, int firstAlbumId, int secondAlbumId);
}
