package com.greenfox.book.Controllers;

import com.greenfox.book.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book("Cat's Cradle", "Kurt Vonnegut", "Pagony", 1963));
        books.add(new Book("Cat's Cradle", "Kurt Vonnegut", "Orion", 1970));
        books.add(new Book("Slaughterhouse 5", "Kurt Vonnegut", "Orion", 1970));
        books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Orion", 1968));
        books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Other", 1979));
    }

    @GetMapping("/book")
    public String showBooks() {
        return "startPage";
    }

    @GetMapping("/book/list")
    public String showBooks(Model model) {

        if (books.isEmpty()){
            model.addAttribute("error","Sorry, there are no books stored!");
        } else {
            model.addAttribute("books", books);
        }
        return "booklist";
    }

    @PostMapping("/book/list")
    public String showBooks(Model model, @RequestParam(required = false) String author, String title, String publisherCo) {
        List<Book> selectedBooks = new ArrayList<>();

        if (author != null && author.length() != 0) {
            selectedBooks = books.stream().filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase())).collect(Collectors.toList());
        }

        if (title != null && title.length() != 0){
            if (selectedBooks.isEmpty())  {
                selectedBooks = books.stream().filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
            } else {
                selectedBooks = selectedBooks.stream().filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
            }
        }

        if (publisherCo != null && publisherCo.length() != 0){
            if (selectedBooks.isEmpty())  {
                selectedBooks = books.stream().filter(book -> book.getPublisherCo().toLowerCase().contains(publisherCo.toLowerCase())).collect(Collectors.toList());
            } else {
                selectedBooks = selectedBooks.stream().filter(book -> book.getPublisherCo().toLowerCase().contains(publisherCo.toLowerCase())).collect(Collectors.toList());
            }
        }
        if (selectedBooks.isEmpty()){
            model.addAttribute("error","Sorry, found no matches");
        } else {
            model.addAttribute("books", selectedBooks);
        }
        return "booklist";
    }

    @GetMapping(value = "/book/{id}/details")
    public String showBooks(Model model, @PathVariable(value="id") Integer id) {
        Optional<Book> selectedBookAsOptional = books.stream().filter(book -> book.getId()==id).findAny();

        if (selectedBookAsOptional.isEmpty()){
            model.addAttribute("error","Sorry, found no matches");
        } else {
            Book selectedBook = new Book(selectedBookAsOptional.get().getTitle(), selectedBookAsOptional.get().getAuthor(), selectedBookAsOptional.get().getPublisherCo(), selectedBookAsOptional.get().getReleaseYear());
            selectedBook.setId(selectedBookAsOptional.get().getId());
            model.addAttribute("book", selectedBook);

        }
        return "selectedBook";
    }

    @PostMapping(value = "/book/{id}/edit")
    public String editBook(Model model, @ModelAttribute Book selectedbook) {
        books.get(selectedbook.getId()).setAuthor(selectedbook.getAuthor());
        books.get(selectedbook.getId()).setTitle(selectedbook.getTitle());
        books.get(selectedbook.getId()).setPublisherCo(selectedbook.getPublisherCo());
        books.get(selectedbook.getId()).setReleaseYear(selectedbook.getReleaseYear());
        model.addAttribute("books", books);
        return "booklist";
    }

    @PostMapping(value = "/book/{id}/delete")
    public String deleteBook(Model model, @ModelAttribute Book selectedbook) {
        List<Book> newList = books.stream().filter(book -> book.getId()!=selectedbook.getId()).collect(Collectors.toList());
        model.addAttribute("books", newList);
        return "booklist";
    }

    @PostMapping(value = "/book/add")
    public String addABook(Model model, @ModelAttribute Book book) {
        books.add(book);
        model.addAttribute("books", books);
        return "booklist";
    }

}


