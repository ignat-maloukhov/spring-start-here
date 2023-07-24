package demo.ignat.controller;

import demo.ignat.dto.TransferRequest;
import demo.ignat.model.Account;
import demo.ignat.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService.transferMoney(
                request.senderAccountId(),
                request.receiverAccountId(),
                request.amount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name) {
        if (Objects.isNull(name)) {
            return transferService.getAll();
        } else {
            return transferService.findAccountsByName(name);
        }
    }

}