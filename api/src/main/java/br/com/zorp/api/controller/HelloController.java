package br.com.zorp.api.controller;
import br.com.zorp.api.model.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String olaMundo(){
        return "Olá Mundo!";
    }

    @PostMapping
    public String jajaMundo(@RequestBody Pessoa pessoa){
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        return "Ola Mundo Post!";
    }

    @DeleteMapping
    public String adeusMundo(){
        return "Adeus Mundo";
    }

    @PutMapping
    public String putMundo(){
        return "Atualizando Mundo";
    }
}
