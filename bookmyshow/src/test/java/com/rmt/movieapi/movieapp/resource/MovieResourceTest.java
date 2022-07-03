//package com.rmt.movieapi.movieapp.resource;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.rmt.movieapi.movieapp.application.MovieService;
//import com.rmt.movieapi.movieapp.domain.Movie;
//import com.rmt.movieapi.movieapp.infrastructure.MovieRepository;
//
//@WebMvcTest(MovieResource.class)
//class MovieResourceTest {
//
//    @Autowired
//    MockMvc mockMvc;
//    
//    @Autowired
//    ObjectMapper mapper;
//
//    @MockBean
//    MovieService movieService;
//    
//    @MockBean
//    MovieRepository movieRepository;
//    
//    
//    @Test
//    public void getAllMovie_success() throws Exception {
//        Movie RECORD_1 = new Movie(1l, "Matrix", 2004, 10);
//
//    	List<Movie> records = new ArrayList<>(Arrays.asList(RECORD_1));
//        
//        Mockito.when(movieRepository.findAll()).thenReturn(records);
//        
//        mockMvc.perform(MockMvcRequestBuilders
//                .get("/api/v1/movies/listall")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//  }
//    
//    @Test
//    public void createMovie_success() throws Exception {
//        Movie record = new Movie(1l, "Matrix", 2004, 10);
//
//
//        Mockito.when(movieRepository.save(record)).thenReturn(record);
//
//        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/v1/movies/add")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .content(this.mapper.writeValueAsString(record));
//
//        mockMvc.perform(mockRequest)
//                .andExpect(status().isOk());
////                .andExpect(jsonPath("$", notNullValue()))
////                .andExpect(jsonPath("$.name", is("John Doe")));
//        }    
//}
