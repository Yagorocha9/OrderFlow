package com.example.spring_java_estudo.repository;

import com.example.spring_java_estudo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
