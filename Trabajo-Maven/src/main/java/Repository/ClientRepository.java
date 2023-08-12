package Repository;

import mapping.dtos.ClientDto;

import java.util.List;

public interface ClientRepository {

    List<ClientDto> listAllClients();
}
