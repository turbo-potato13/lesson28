package com.vtb.api;

import com.vtb.api.bookstore.GetBookRequest;
import com.vtb.api.bookstore.GetBookResponse;
import com.vtb.api.bookstore.GetBooksResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndPoint {
    private static final String NAMESPACE_URI = "http://www.vtb.com/api/bookstore";

    private BookRepository bookRepository;

    @Autowired
    public BookEndPoint(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request){
        GetBookResponse response = new GetBookResponse();
        response.setBook(bookRepository.findById(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBooksRequest")
    @ResponsePayload
    public GetBooksResponse getBooks(){
        GetBooksResponse response = new GetBooksResponse();
        response.getBooks().addAll(bookRepository.findAll());
        return response;

    }


}
