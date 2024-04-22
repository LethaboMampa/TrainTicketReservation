package Service;

import Entity.Ticket;

import java.util.List;

public interface TicketService
{
    Ticket createTicket(Ticket ticket);
    Ticket updateTicket(Ticket ticket);
    void deleteTicket(Long ticketId);
    Ticket getTicketById(Long ticketId);
    List<Ticket> getAllTickets();
}
