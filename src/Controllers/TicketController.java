package Controllers;

import DTO.IssueTicketRequestDTO;
import DTO.IssueTicketResponseDTO;
import DTO.ResponseType;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getVehicleType(),
                    requestDTO.getGateId());

            response.setTicket(ticket);
            response.setResponseStatus(ResponseType.SUCCESS);
        }
        catch (Exception e) {
            response.setResponseStatus(ResponseType.FAILURE);
            response.setFailureMessage(e.getMessage());
        }
        return response;
    }
}

//Controller takes care of
//1. Needs to interact with client
//2. Validations on inputs
//3. Call the service and provide it with that input
//4. Receive the output from service and send it over the client in proper format