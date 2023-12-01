package Controllers;

import DTO.IssueTicketRequestDTO;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public void IssueTicketResponseDTO(IssueTicketRequestDTO requestDTO) {

    }
}
