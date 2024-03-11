package br.com.devmedia.introspringbootweb.service;

import br.com.devmedia.introspringbootweb.domain.Playlist;

import java.util.List;

public interface PlaylistService {
    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}
