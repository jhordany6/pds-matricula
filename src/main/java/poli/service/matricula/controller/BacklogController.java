package poli.service.matricula.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import poli.service.matricula.entities.Backlog;
import poli.service.matricula.helper.ResponseBuilder;
import poli.service.matricula.model.Response;
import poli.service.matricula.service.BacklogService;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/backlog")
@RequiredArgsConstructor
public class BacklogController {

    // @Autowired
    private final BacklogService service;
    private final ResponseBuilder builder;

    @GetMapping
    public List<Backlog> findAll(){
        return service.findAll();
    }

    /*
      @PostMapping
    public Backlog create(@RequestBody Backlog backlog){
        return service.create(backlog);
    }
     */
    @PostMapping()
    public Response create(@Valid @RequestBody Backlog backlog, BindingResult result){
        if(result.hasErrors()){
            return builder.failed(formatMessage(result));
        }
        service.create(backlog);
        return builder.success(backlog);

    }

    private  List<Map<String,String>> formatMessage(BindingResult result){
        List<Map<String,String>> errors = result.getFieldErrors().stream()
                .map(err -> {
                    Map<String,String> error = new HashMap<>();
                    error.put(err.getField(),err.getDefaultMessage());
                    return error;
                }).collect(Collectors.toList());
        return errors;
    }
}
