package me.dio.BibliotecaAPI.Controller;

import me.dio.BibliotecaAPI.domain.model.Livro;
import me.dio.BibliotecaAPI.domain.repository.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository)
    {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public Iterable<Livro> listarLivros() {

        return livroRepository.findAll();
    }

    @GetMapping("/autor/{autor}")
    public Iterable<Livro> listarPorAutor(@PathVariable String autor)
    {
        return livroRepository.findByAutor(autor);
    }

    @GetMapping("/ano/{ano}")
    public Iterable<Livro> listarPorAno(@PathVariable int ano)
    {
        return livroRepository.findByAno(ano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro novoLivro) {
        Optional<Livro> livroExistente = livroRepository.findById(id);

        if (livroExistente.isPresent()) {
            Livro livro = livroExistente.get();
            livro.setTitulo(novoLivro.getTitulo());
            livro.setAno(novoLivro.getAno());
            livro.setAutor(novoLivro.getAutor());

            Livro livroAtualizado = livroRepository.save(livro);
            return ResponseEntity.ok(livroAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro)
    {
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarLivro(@PathVariable Long id)
    {
        Optional<Livro> livro =  livroRepository.findById(id);
        if(livro.isPresent())
        {
            livroRepository.deleteById(id);
            return ResponseEntity.ok("Livro excluido com sucesso.");
        }
        else {
            return  ResponseEntity.notFound().build();
        }
    }
}
