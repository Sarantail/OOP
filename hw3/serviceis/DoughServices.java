package hw3.serviceis;

import hw3.entityes.Dough;
import hw3.repository.DoughRepository;
import hw3.view.GetDoughByNameResponse;

public class DoughServices {
    private final DoughRepository doughRepository;

    public DoughServices(DoughRepository doughRepository) {
        this.doughRepository = doughRepository;
    }

    public GetDoughByNameResponse getDoughByName(String name) {
        Dough dough = doughRepository.getDoughByName(name);
        if (dough == null) {
            return new GetDoughByNameResponse(true, "Такой вид теста не найден", null);
        }
        return new GetDoughByNameResponse(false, null, dough);
    }

    public Boolean addDough(Dough dough) {
        return doughRepository.addDough(dough);
    }
}
