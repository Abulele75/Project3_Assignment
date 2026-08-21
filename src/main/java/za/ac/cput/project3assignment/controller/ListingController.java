package za.ac.cput.project3assignment.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.Listing;
import za.ac.cput.project3assignment.service.ListingService;

import java.util.List;

/* Keano Elchano Winnaar
230935869
Listing controller class
21/08/2026
 */

@RestController
@RequestMapping("/api/listings")
@CrossOrigin(origins = "http://localhost:5173")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @PostMapping
    public Listing create(@RequestBody Listing listing) {
        return listingService.create(listing);
    }

    @GetMapping("/{listingID}")
    public Listing read(@PathVariable String listingID) {
        return listingService.read(listingID);
    }

    @GetMapping
    public List<Listing> getAll() {
        return listingService.getAll();
    }

    @PutMapping
    public Listing update(@RequestBody Listing listing) {
        return listingService.update(listing);
    }

    @DeleteMapping("/{listingID}")
    public void delete(@PathVariable String listingID) {
        listingService.delete(listingID);
    }
}