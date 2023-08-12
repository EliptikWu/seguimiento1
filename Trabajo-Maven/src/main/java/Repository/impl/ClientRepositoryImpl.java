package Repository.impl;

import Repository.ClientRepository;
import domain.models.Client;
import mapping.dtos.ClientDto;
import mapping.mappers.ClientMapper;

import java.util.Arrays;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    private List<Client> clients;

    public ClientRepositoryImpl() {
        ClientRepository reClient = new ClientRepositoryImpl();
        clients = ClientMapper.mapFrom(reClient.listAllClients());

        List<Client> clients = Arrays.asList(new Client(1L, "Likun", 1),
                new Client(2L, "John", 2),
                new Client(3L, "Mary", 3)
        );
    }

    @Override
    public List<ClientDto> listAllClients() {
        return ClientMapper.mapFromDto(clients);
    }
}
