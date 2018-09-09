package com.minttcode.hackathon.iqr.endpoint;

import com.minttcode.hackathon.iqr.model.Producto;
import com.minttcode.hackathon.iqr.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("/user/{idUser}")
    public @ResponseBody
    List<Producto> getProductByIdUser(@PathVariable String idUser) {
        return productoService.getProductoByIdUser("2222222234");
    }

    @GetMapping("/{upc}")
    public @ResponseBody
    Producto getProductByUpc(@PathVariable String upc) {
        return productoService.getProductoByUpc(upc);
    }


    @PostMapping
    public void createProducto (@RequestBody Producto producto){
        if (producto != null){
            productoService.createProducto(producto);

        }

    }



}
