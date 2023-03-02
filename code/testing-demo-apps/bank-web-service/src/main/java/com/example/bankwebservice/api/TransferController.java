package com.example.bankwebservice.api;

import com.example.bankwebservice.dto.TransferRequest;
import com.example.bankwebservice.dto.TransferResponse;
import com.example.bankwebservice.entity.Transaction;
import com.example.bankwebservice.service.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/transfer")
public class TransferController {

    private final TransferService transferService;

    @GetMapping()
    public String transferForm() {
        return "redirect:transfer-form.html";
    }

    @PostMapping
    public ResponseEntity<?> doTransfer(
            @RequestBody TransferRequest transferRequest) {

        Transaction transaction=transferService.transfer(transferRequest.getAmount(), transferRequest.getSource(),
                transferRequest.getDestination());

        TransferResponse transferResponse = new TransferResponse();
        transferResponse.setTransactionId(transaction.getId());
        transferResponse.setCurrentBalance(transaction.getClosingBalance());
        transferResponse.setMessage("Transfer Success");

        return ResponseEntity.ok(transferResponse);

    }

}
