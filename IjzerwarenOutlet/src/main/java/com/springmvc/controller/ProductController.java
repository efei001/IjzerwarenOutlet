package com.springmvc.controller;


import com.springmvc.model.Product;
import com.springmvc.service.ProductService;
import java.io.IOException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private static String titelNieuw = "New product";
    private static String titelWijzig = "Edit product";
    private static String titelVerwijder = "Remove product";


    @RequestMapping(value = "/list")
    public ModelAndView productList() throws IOException {

        ModelAndView productListView = new ModelAndView("productList");
        productListView.addObject("products", productService.getProducts());

        return productListView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView productAddPage() throws IOException {

        ModelAndView productAddView = new ModelAndView("productAdd");
        productAddView.addObject("paginaTitel", titelNieuw);
        productAddView.addObject("product", new Product());
        return productAddView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView productAdd(@ModelAttribute("product") @Valid Product product) throws IOException {

//        if (product.getName().isEmpty() && product.getWeight().isEmpty() && product.getDescription().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error", "Name is empty!").addObject("error2", "Weight is empty!").addObject("error3", "Description is empty!");
//        }
//
//        if (product.getName().isEmpty() && product.getWeight().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error", "Name is empty!").addObject("error2", "Weight is empty!");
//        }
//
//        if (product.getName().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error", "Name is empty!");
//        }
//
//        if (product.getWeight().isEmpty() && product.getDescription().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error2", "Weight is empty!").addObject("error3", "Description is empty!");
//        }
//
//        if (product.getWeight().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error2", "Weight is empty!");
//        }
//
//        if (product.getDescription().isEmpty()) {
//            return new ModelAndView("productAdd").addObject("error3", "Description is empty!");
//        }
        

        ModelAndView productListView = new ModelAndView("productList");
        productService.addProduct(product);
        productListView.addObject("products", productService.getProducts());
        String message = "Product was succesfully added.";
        productListView.addObject("message", message);

        return productListView;

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editProductPage(@PathVariable int id) {

        ModelAndView productEditView = new ModelAndView("productEdit");
        productEditView.addObject("paginaTitel", titelWijzig);
        productEditView.addObject("product", productService.getProduct(id));

        return productEditView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView productEdit(@ModelAttribute("product") Product product) {

        ModelAndView productListView = new ModelAndView("productList");
        productService.updateProduct(product);
        productListView.addObject("products", productService.getProducts());
        String message = "Product was succesfully edited.";
        productListView.addObject("message", message);

        return productListView;
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public ModelAndView removeProduct(@PathVariable int id) {

        ModelAndView productListView = new ModelAndView("productList");
        productService.deleteProduct(id);
        productListView.addObject("products", productService.getProducts());
        String message = "Product was succesfully deleted. <br/>";
        productListView.addObject("message", message);

        return productListView;
    }
}